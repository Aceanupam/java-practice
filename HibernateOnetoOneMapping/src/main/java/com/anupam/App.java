package com.anupam;

import java.util.Date;
import org.hibernate.Session;

import com.anupam.stock.Stock;
import com.anupam.stock.StockDetail;
import com.anupam.util.HibernateUtil;


public class App {
	public static void main(String[] args) {
		System.out.println("Hibernate one to one (XML mapping)");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Stock stock = new Stock();

		stock.setStockCode("47155");
		stock.setStockName("GENMM");

		StockDetail stockDetail = new StockDetail();
		stockDetail.setCompName("GENTING Malaysia");
		stockDetail.setCompDesc("Best resort in the world");
		stockDetail.setRemark("Nothing Special");
		stockDetail.setListedDate(new Date());

		stock.setStockDetail(stockDetail);
		stockDetail.setStock(stock);

		session.save(stock);
		session.getTransaction().commit();

		System.out.println("Done");
	}
}

