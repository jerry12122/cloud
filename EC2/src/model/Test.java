package model;

public class Test {

	public static void main(String[] args) {
		int total =0;
		Customer c1 = new Customer();
		Customer c2 = new Customer("jykuo","1234", 1, 1000);
		String passwd = c2.getPasswd();
		int vip = c2.getVip(); 
		Product p1 = new Product();
		Product p2 = new Product("Book","C++", 150);
		String type = p2.getType();
		String title = p2.getTitle();
		ShoppingCart s1 = new ShoppingCart(c1);
		s1.buy(new Product("Book","Java", 100));
		s1.buy(new Product("Book","C++", 150));
		total = s1.getTotal();
		c1.pay(20);
		System.out.println("Hello " + c1.getName() + " your point is " + c1.getPoint());
		c2.pay(20);
		System.out.println("Hello " + c2.getName() + " your point is " + c2.getPoint());
		System.out.println("Hello " + s1.getCustomer().getName() + " your cost is " + s1.getTotal());
	}
}