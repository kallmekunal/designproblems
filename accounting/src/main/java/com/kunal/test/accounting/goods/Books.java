package com.kunal.test.accounting.goods;

public class Books extends Goods {
	

	public Books(boolean isBasicSalesExampted, boolean isImported, int price) {
		super(isBasicSalesExampted, isImported,price);
	}
	
	public static Books newInstance(boolean isBasicSalesExampted, boolean isImported, int price) {
		return new Books(isBasicSalesExampted, isImported, price);
	}
	
	/*public Goods applySalesTax() 
	{
		if(!isBasicSalesExampted) 
		{
				this.setTaxCalculated(this.getTaxCalculated()+ this.getPrice()*(10/100));
		}
		System.out.println("Books");
		return this;
	}*/
}
