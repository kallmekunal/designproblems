package com.kunal.test.accounting;

import java.util.ArrayList;
import java.util.List;

import com.kunal.test.accounting.goods.Books;
import com.kunal.test.accounting.goods.Food;
import com.kunal.test.accounting.goods.Goods;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Goods book1 = Books.newInstance(true, true, 100);
        Goods book2 = Books.newInstance(false, true, 100);
        Goods food = Food.newInstance(false, true, 1000);
        List<Goods> shoppingCart= new ArrayList<>();
        shoppingCart.add(book1);
        shoppingCart.add(book2);
        shoppingCart.add(food);
        shoppingCart.stream().forEach(e -> e.applyImportTax().applySalesTax());
        //Summing up
        Double totalTax = shoppingCart.stream().mapToDouble(Goods::getTaxCalculated).sum();
        Double totalBaseCost = shoppingCart.stream().mapToDouble(Goods::getPrice).sum();
        System.out.println("Total Price :" + (totalBaseCost+totalTax));
    }
}
