
package name.alexandresmirnov.gemini_client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Hello world!
 *
 */
public class GeminiExchange {
    public static void main( String[] args ) {

        System.out.println(getTicker("btcusd"));
        System.out.println(getOrderBook("btcusd"));
    } 

    //in the future: this should return a Ticker ready to work with
    public static Ticker getTicker(String symbol){
    	
    	String priceSymbol = symbol.substring(0, 3).toUpperCase();
    	String quantitySymbol = symbol.substring(3, 6).toUpperCase();
    		
    	Ticker result = new Ticker();
        
        try {
        	
        	String output = getRequest("https://api.gemini.com/v1/pubticker/"+priceSymbol.toUpperCase()+quantitySymbol.toUpperCase());

            ObjectMapper mapper = new ObjectMapper();
            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            
            result = mapper.readValue(output, Ticker.class);

            JsonNode root = mapper.readValue(output, JsonNode.class);

            result.getVolume().setPriceSymbol(root.path("volume").path(priceSymbol).asText());
            result.getVolume().setQuantitySymbol(root.path("volume").path(quantitySymbol).asText());
            
            
        } catch (Exception e) {

            e.printStackTrace(); 
        }

        return result;

    }
    
    //TODO: implement URL parameters limit_bids and limit_asks
    public static OrderBook getOrderBook(String symbol){
    	
    	String priceSymbol = symbol.substring(0, 3).toUpperCase();
    	String quantitySymbol = symbol.substring(3, 6).toUpperCase();
    	
    	OrderBook result = new OrderBook();
    	
    	try {
        	
        	String output = getRequest("https://api.gemini.com/v1/book/"+priceSymbol.toUpperCase()+quantitySymbol.toUpperCase());

            ObjectMapper mapper = new ObjectMapper();
            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            
     
            result = mapper.readValue(output, OrderBook.class);

            
        } catch (Exception e) {

            e.printStackTrace(); 
        }
    	
    	return result;
    }
    
    public static String getRequest(String url) throws RuntimeException{
    	Client client = Client.create();

        WebResource webResource = client
            .resource(url);

        ClientResponse response = webResource.accept("application/json")
            .get(ClientResponse.class);

        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }
        
        return response.getEntity(String.class);
    }

    
    public static List<String> getSymbols(){

        List<String> symbols = new ArrayList<String>();

        try {

        	String output = getRequest("https://api.gemini.com/v1/symbols");
            
            ObjectMapper mapper = new ObjectMapper();
            
            symbols = mapper.readValue(output,  mapper.getTypeFactory().constructCollectionType(ArrayList.class, String.class));



        } catch (Exception e) {

            e.printStackTrace(); 
        } 
        return symbols;
    }
}
