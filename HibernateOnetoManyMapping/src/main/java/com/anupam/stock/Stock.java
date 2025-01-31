package com.anupam.stock;

import java.util.HashSet;
import java.util.Set;

public class Stock implements java.io.Serializable {

	public Integer getStockId() {
		return stockId;
	}
	public void setStockId(Integer stockId) {
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
	public Set<StockDailyRecord> getStockDailyRecords() {
		return stockDailyRecords;
	}
	public void setStockDailyRecords(Set<StockDailyRecord> stockDailyRecords) {
		this.stockDailyRecords = stockDailyRecords;
	}
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stock(Integer stockId, String stockCode, String stockName, Set<StockDailyRecord> stockDailyRecords) {
		super();
		this.stockId = stockId;
		this.stockCode = stockCode;
		this.stockName = stockName;
		this.stockDailyRecords = stockDailyRecords;
	}
	private Integer stockId;
	private String stockCode;
	private String stockName;
	private Set<StockDailyRecord> stockDailyRecords = 
				new HashSet<StockDailyRecord>(0);

	//getter, setter and constructor
}

