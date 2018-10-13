package com.kunal.test.accounting.taxes;

import com.kunal.test.accounting.goods.Goods;

@Deprecated
public class TaxUtil {
	
	private final static double SALES_TAX = 10;
	private final static double IMPORT_DUTY = 5;
	
	public static void calculateTax(Goods goods){
		addBasicTax(goods);
		addImportDuty(goods);
	}

	private static void addImportDuty(Goods goods) {
		if(goods.isImported())
		{
			goods.setTaxCalculated(goods.getTaxCalculated()+ goods.getPrice()*(IMPORT_DUTY/100));
		}
		
	}

	private static void addBasicTax(Goods goods) {
		if(!goods.isBasicSalesExampted())
		{
			goods.setTaxCalculated(goods.getTaxCalculated()+ goods.getPrice()*(SALES_TAX/100));
		}
	}
	

}
