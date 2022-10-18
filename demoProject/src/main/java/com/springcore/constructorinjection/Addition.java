package com.springcore.constructorinjection;

public class Addition {
	private int a;
	private int b;
	
	public Addition(double a, double b)
	{
		this.a=(int) a;
		this.b=(int) b;
		System.out.println("double method");
	}
    public Addition(int a, int b)
    {
    	this.a=a;
    	this.b=b;
    	System.out.println("int method");
 }
    public Addition(String X, String Y)
    {
    	this.a = Integer.parseInt(X);
    	this.b = Integer.parseInt(Y);
    	System.out.println("String method");
    }
    
    public void show()
    {
    	System.out.println("sum is:"+(this.a+this.b));
    }
}
