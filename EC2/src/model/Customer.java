package model;

public class Customer{
    private String _name;
    private String _passwd;
    private int _vip;
    private int _point;
    public Customer()
    {
        _name = "kjy";
        _passwd = "0000";
        _vip = 0;
        _point = 9000;
    }
    public Customer(String name,String passwd,int vip,int point)
    {
        this._name = name;
        this._passwd = passwd;
        this._vip = vip;
        this._point = point;
    }
    public String getName(){return this._name;}
    public String getPasswd(){return this._passwd;}
    public int getVip(){return this._vip;}
    public int getPoint(){return this._point;}
    public void pay(int cost){
        if(this._vip == 1)
        {
            cost = (int)(cost*0.8);
        }
        this._point=this._point-cost;
    }

}