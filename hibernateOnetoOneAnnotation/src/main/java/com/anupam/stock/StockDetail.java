package com.anupam.stock;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "stock_detail", catalog = "hibernate")
public class StockDetail implements java.io.Serializable {

	private Integer stockId;
	private Stock stock;
	private String compName;
	private String compDesc;
	private String remark;
	private Date listedDate;
	public StockDetail(Integer stockId, Stock stock, String compName, String compDesc, String remark, Date listedDate) {
		super();
		this.stockId = stockId;
		this.stock = stock;
		this.compName = compName;
		this.compDesc = compDesc;
		this.remark = remark;
		this.listedDate = listedDate;
	}
	public StockDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GenericGenerator(name = "generator", strategy = "foreign", 
	parameters = @Parameter(name = "property", value = "stock"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "STOCK_ID", unique = true, nullable = false)
	public Integer getStockId() {
		return stockId;
	}
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	
	@Column(name = "COMP_NAME", nullable = false, length = 100)
	public String getCompName() {
		return compName;
	}
	
	public void setCompName(String compName) {
		this.compName = compName;
	}
	@Column(name = "COMP_DESC", nullable = false)
	public String getCompDesc() {
		return compDesc;
	}
	
	
	public void setCompDesc(String compDesc) {
		this.compDesc = compDesc;
	}
	@Column(name = "REMARK", nullable = false)
	public String getRemark() {
		return remark;
	}
	

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "LISTED_DATE", nullable = false, length = 10)
	public Date getListedDate() {
		return listedDate;
	}
	public void setListedDate(Date date) {
		this.listedDate = date;
	}
	
	

}
