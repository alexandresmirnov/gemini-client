package name.alexandresmirnov.gemini_client;

import java.util.Arrays;

public class OrderBook {

	@Override
	public String toString() {
		return "OrderBook [bids=" + Arrays.toString(bids) + ", asks=" + Arrays.toString(asks) + "]";
	}
	private static class Order {

		@Override
		public String toString() {
			return "Order [price=" + price + ", amount=" + amount + "]";
		}

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
	
	Order[] bids;
	Order[] asks;
	
	public void setBids(Order[] entries){
		bids = entries;
	}
	
	public Order[] getBids(){
		return bids;
	}
	
	public void setAsks(Order[] entries){
		asks = entries;
	}
	
	public Order[] getAsks(){
		return asks;
	}
	
}
