package com.kunal.test.accounting.report;

import java.util.List;

import com.kunal.test.accounting.goods.Goods;

public class ReporterUtil {
	
	public static void printPrices(List<Goods> allBilledGoods) {
		
		allBilledGoods.stream().forEach(g -> System.out.println("Price :"+g.getPrice() + " Tax :"+g.getTaxCalculated() ));
		
	}

}
