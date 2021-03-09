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
    public void remove(Product p) {
    	try {
    		if (products.contains(p))
    			products.remove(p);
    		else {
    			throw (new Exception());
			}
    	}
    	catch (Exception e) 
    	{
    		e.printStackTrace();
    	}
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
    public int searchPriceByTitle(String title)
    {
    	String name;
    	int result = 0;
    	for(int i = 0;i<products.size();i++) {
    		name = products.get(i).getTitle();
    		if(name == title)
    		{
    			result = products.get(i).getPrice();
    			break;
    		}
    	}
    	return result;
    }
    public void printAllProduct()
    {
    	for(int i = 0;i<products.size();i++) {
    		System.out.println(products.get(i).getTitle()+" "+products.get(i).getPrice());
    	}
    }
}