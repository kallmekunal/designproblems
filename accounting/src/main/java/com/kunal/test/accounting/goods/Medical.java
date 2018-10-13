package com.kunal.test.accounting.goods;

public class Medical extends Goods {
	int price;

	public Medical(boolean isBasicSalesExampted, boolean isImported, int price) {
		super(isBasicSalesExampted, isImported,price);
	}
	
	public static Medical newInstance(boolean isBasicSalesExampted, boolean isImported, int price) {
		return new Medical(isBasicSalesExampted, isImported, price);
	}
}
