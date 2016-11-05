package name.alexandresmirnov.gemini_client;

public class Ticker {


	static class Volume {
		
		String priceSymbol, quantitySymbol;
		double timestamp;
		
		public void setPriceSymbol(String symbol){
			priceSymbol = symbol;
		}
		
		public void setQuantitySymbol(String symbol){
			quantitySymbol = symbol;
		}
		
		public void setTimestamp(double value){
			timestamp = value;
		}
		
		public String getPriceSymbol(){
			return priceSymbol;
		}
		
		public String getQuantitySymbol(){
			return quantitySymbol;
		}
		
		public double getTimestamp(){
			return timestamp;
		}
		
		@Override
		public String toString() {
			return "Volume [priceSymbol=" + priceSymbol + ", quantitySymbol=" + quantitySymbol + ", timestamp="
					+ timestamp + "]";
		}
	}
	
	double bid, ask, last;
	Volume volume;
	
	public void setBid(double bid){
		this.bid = bid;
	}
	
	public void setAsk(double ask){
		this.ask = ask;
	}
	
	public void setLast(double last){
		this.last = last;
	}
	
	
	public void setVolume(Volume volume){
		this.volume = volume;
	}
	
	
	public double getBid(){
		return this.bid;
	}
	
	public double getAsk(){
		return this.ask;
	}
	
	public double getLast(){
		return this.last;
	}
	
	
	public Volume getVolume(){
		return this.volume;
	}
	
	@Override
	public String toString() {
		return "Ticker [bid=" + bid + ", ask=" + ask + ", last=" + last + ", volume=" + volume + "]";
	}
	
	
}
