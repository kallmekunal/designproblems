package com.kunal.test.accounting;

import org.junit.Test;

import com.kunal.test.accounting.goods.Books;
import com.kunal.test.accounting.goods.Goods;
import com.kunal.test.accounting.taxes.TaxUtil;

import junit.framework.TestCase;

public class TestTaxUtil extends TestCase {
	
	@Test
	public void testCalculateTax() {
		Goods goods = Books.newInstance(true, true, 100);
		TaxUtil.calculateTax(goods);
		assertEquals(5.0, goods.getTaxCalculated());
	}

}
