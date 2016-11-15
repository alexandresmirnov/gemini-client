package name.alexandresmirnov.gemini_client;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

public class OrderBook {
	
	private static class Order {
		
		double price, amount;
		Timestamp timestamp;
		
		public void setPrice(double value){
			price = value;
		}
		
		public void setAmount(double value){
			amount = value;
		}
		
		public double getPrice(){
			return price;
		}

		public double getAmount(){
			return amount;
		}
		

		public Timestamp getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(Timestamp timestamp) {
			this.timestamp = timestamp;
		}

		public String toString(){
			return new ToStringBuilder(this).
					append("price", price).
					append("amount", amount).
					append("timestamp", timestamp).
					toString();
		}
		
	}
	
	List<Order> bids;
	List<Order> asks;
	
	public void setBids(Order[] entries){
		bids = new ArrayList<Order> (Arrays.asList(entries));
	}
	
	public List<Order> getBids(){
		return bids;
	}
	
	public void setAsks(Order[] entries){
		asks = new ArrayList<Order> (Arrays.asList(entries));
	}
	
	public List<Order> getAsks(){
		return asks;
	}
	
	public String toString(){
		return new ToStringBuilder(this).
				append("bids", bids).
				append("asks", asks).
				toString();
	}
	
	
}
