package model;

public class Product{
    private String type;
    private String title;
    private int price;
    public Product()
    {
        type = "";
        title = "";
        price = 0;
    }
    public Product(String type,String title,int price)
    {
        this.type = type;
        this.title = title;
        this.price = price;
    }
    public String getType() {return this.type;}
    public String getTitle() {return this.title;}
    public int getPrice() {return this.price;}
}
