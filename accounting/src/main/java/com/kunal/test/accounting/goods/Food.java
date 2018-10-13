package com.kunal.test.accounting.goods;

public class Food extends Goods {

	public Food(boolean isBasicSalesExampted, boolean isImported, int price) {
		super(isBasicSalesExampted, isImported,price);
	}
	public static Food newInstance(boolean isBasicSalesExampted, boolean isImported, int price) {
		return new Food(isBasicSalesExampted, isImported, price);
	}

}
