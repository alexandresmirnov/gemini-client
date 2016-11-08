package name.alexandresmirnov.gemini_client;

public class Order {

	double price, amount;
	
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
	
}
