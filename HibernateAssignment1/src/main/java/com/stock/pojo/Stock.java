package com.stock.pojo;

public class Stock {

	private int stockId;
	private String stockCode;
	private String stockName;
	public Stock(int stockId, String stockCode, String stockName) {
		super();
		this.stockId = stockId;
		this.stockCode = stockCode;
		this.stockName = stockName;
	}
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockCode=" + stockCode + ", stockName=" + stockName + "]";
	}
	


}
