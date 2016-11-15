package name.alexandresmirnov.gemini_client;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Trade {
	int tid;
	long timestamp, timestampms;
	BigDecimal price, amount;
	String type, exchange;
	boolean broken;


	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}


	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public long getTimestampms() {
		return timestampms;
	}

	public void setTimestampms(long timestampms) {
		this.timestampms = timestampms;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public boolean isBroken() {
		return broken;
	}

	public void setBroken(boolean broken) {
		this.broken = broken;
	}

	public String toString(){
		return new ToStringBuilder(this).
				append("timestamp", timestamp).
				append("timestampms", timestampms).
				append("tid", tid).
				append("price", price).
				append("amount", amount).
				append("type", type).
				append("broken", broken).
				toString();
	}
	
}
