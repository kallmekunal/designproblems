package com.kunal.test.accounting.goods;

public abstract class Goods {

	boolean isBasicSalesExampted;
	boolean isImported;
	double taxCalculated;
	private double price;
	
	public Goods applySalesTax() 
	{
		if(!isBasicSalesExampted) 
		{
				this.setTaxCalculated(this.getTaxCalculated()+ this.getPrice()*(10.0/100));
		}
		return this;
	}
	
	
	public Goods applyImportTax() 
	{
		if(isImported) 
		{
				this.setTaxCalculated(this.getTaxCalculated()+ this.getPrice()*(5.0/100));
		}
		return this;
	}
	
	
	public double getTaxCalculated() {
		return taxCalculated;
	}

	public void setTaxCalculated(double d) {
		this.taxCalculated = d;
	}

	public Goods(boolean isBasicSalesExampted, boolean isImported, int price) {
		this.isBasicSalesExampted = isBasicSalesExampted;
		this.isImported = isImported;
		this.price = price;
	}

	public boolean isBasicSalesExampted() {
		return isBasicSalesExampted;
	}

	public void setBasicSalesExampted(boolean isBasicSalesExampted) {
		this.isBasicSalesExampted = isBasicSalesExampted;
	}

	public boolean isImported() {
		return isImported;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setImported(boolean isImported) {
		this.isImported = isImported;
	}
	
}
