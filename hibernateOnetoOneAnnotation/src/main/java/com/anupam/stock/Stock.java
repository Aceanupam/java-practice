package com.anupam.stock;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name= "Stock", catalog= "hibernate", uniqueConstraints= {
@UniqueConstraint(columnNames="STOCK_NAME"),
@UniqueConstraint(columnNames="STOCK_CODE") })
public class Stock implements java.io.Serializable {

	private Integer stockId;
	private String stockCode;
	private String stockName;
	private StockDetail stockDetail;
	
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stock(String stockCode, String stockName)
	{
		this.stockCode=stockCode;
		this.stockName=stockName;
	}
	public Stock( String stockCode, String stockName, StockDetail stockDetail) {
		this.stockCode = stockCode;
		this.stockName = stockName;
		this.stockDetail = stockDetail;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="STOCK_ID", unique=true,nullable=false)
	public Integer getStockId() {
		return stockId;
	}
	
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
	
	
	@Column(name = "STOCK_CODE", unique = true, nullable = false)
	public String getStockCode() {
		return stockCode;
	}
	
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	
	@Column(name = "STOCK_NAME", unique = true, nullable = false)
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "stock", cascade = CascadeType.ALL)
	public StockDetail getStockDetail() {
		return stockDetail;
	}
	public void setStockDetail(StockDetail stockDetail) {
		this.stockDetail = stockDetail;
	}
	
}
