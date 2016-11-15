package name.alexandresmirnov.gemini_client;

import java.math.BigDecimal;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Auction {

	long closedUntilMs, nextAuctionMs, nextUpdateMs; //TODO: do the timestamp stuff
	int lastAuctionEid;

	BigDecimal lastAuctionPrice, 
		lastAuctionQuantity, 
		lastHighestBidPrice, 
		lastLowestAskPrice, 
		mostRecentIndicativePrice, 
		mostRecentIndicativeQuantity,
		mostRecentHighestBidPrice,
		mostRecentLowestAskPrice;

	
	public String toString(){
		return new ToStringBuilder(this).
				append("closedUntilMs", closedUntilMs).
				append("nextAuctionMs", nextAuctionMs).
				append("nextUpdateMs", nextUpdateMs).
				append("lastAuctionPrice", lastAuctionPrice).
				append("lastAuctionQuantity", lastAuctionQuantity).
				append("lastHighestBidPrice", lastHighestBidPrice).
				append("lastLowestAskPrice", lastLowestAskPrice).
				append("mostRecentIndicativePrice", mostRecentIndicativePrice).
				append("mostRecentIndicativeQuantity", mostRecentIndicativeQuantity).
				append("mostRecentHighestBidPrice", mostRecentHighestBidPrice).
				append("mostRecentLowestAskPrice", mostRecentLowestAskPrice).
				toString();
	}
	
	//TODO: this looks ugly
	public int getLastAuctionEid() {
		return lastAuctionEid;
	}
	public void setLastAuctionEid(int lastAuctionEid) {
		this.lastAuctionEid = lastAuctionEid;
	}
	public long getNextUpdateMs() {
		return nextUpdateMs;
	}
	public void setNextUpdateMs(long nextUpdateMs) {
		this.nextUpdateMs = nextUpdateMs;
	}
	public BigDecimal getMostRecentIndicativePrice() {
		return mostRecentIndicativePrice;
	}
	public void setMostRecentIndicativePrice(BigDecimal mostRecentIndicativePrice) {
		this.mostRecentIndicativePrice = mostRecentIndicativePrice;
	}
	public BigDecimal getMostRecentIndicativeQuantity() {
		return mostRecentIndicativeQuantity;
	}
	public void setMostRecentIndicativeQuantity(BigDecimal mostRecentIndicativeQuantity) {
		this.mostRecentIndicativeQuantity = mostRecentIndicativeQuantity;
	}
	public BigDecimal getMostRecentHighestBidPrice() {
		return mostRecentHighestBidPrice;
	}
	public void setMostRecentHighestBidPrice(BigDecimal mostRecentHighestBidPrice) {
		this.mostRecentHighestBidPrice = mostRecentHighestBidPrice;
	}
	public BigDecimal getMostRecentLowestAskPrice() {
		return mostRecentLowestAskPrice;
	}
	public void setMostRecentLowestAskPrice(BigDecimal mostRecentLowestAskPrice) {
		this.mostRecentLowestAskPrice = mostRecentLowestAskPrice;
	}
	public long getClosedUntilMs() {
		return closedUntilMs;
	}
	public void setClosedUntilMs(long closedUntilMs) {
		this.closedUntilMs = closedUntilMs;
	}
	public long getNextAuctionMs() {
		return nextAuctionMs;
	}
	public void setNextAuctionMs(long nextAuctionMs) {
		this.nextAuctionMs = nextAuctionMs;
	}
	public BigDecimal getLastAuctionPrice() {
		return lastAuctionPrice;
	}
	public void setLastAuctionPrice(BigDecimal lastAuctionPrice) {
		this.lastAuctionPrice = lastAuctionPrice;
	}
	public BigDecimal getLastAuctionQuantity() {
		return lastAuctionQuantity;
	}
	public void setLastAuctionQuantity(BigDecimal lastAuctionQuantity) {
		this.lastAuctionQuantity = lastAuctionQuantity;
	}
	public BigDecimal getLastHighestBidPrice() {
		return lastHighestBidPrice;
	}
	public void setLastHighestBidPrice(BigDecimal lastHighestBidPrice) {
		this.lastHighestBidPrice = lastHighestBidPrice;
	}
	public BigDecimal getLastLowestAskPrice() {
		return lastLowestAskPrice;
	}
	public void setLastLowestAskPrice(BigDecimal lastLowestAskPrice) {
		this.lastLowestAskPrice = lastLowestAskPrice;
	}
	
	
	
}
