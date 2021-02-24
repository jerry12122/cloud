package model;

import java.util.*;

public class ShoppingCart{
    private Customer customer;
    private ArrayList<Product> products = new ArrayList();
    public ShoppingCart(Customer c) {
    	this.customer = c;
    	
    }
    public Customer getCustomer()
    {
    	return customer;
    }
    public void buy(Product p){
    	products.add(p);
    }
    public void remove(Product p){
    	products.remove(p);
    }
    public int getTotal() {
    	Product p;
    	int total = 0;
    	for(int i = 0;i<products.size();i++) {
    		p = products.get(i);
    		total += p.getPrice();
    	}
    	return total;
    }
}