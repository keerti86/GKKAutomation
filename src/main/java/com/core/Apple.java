package com.core;

public class Apple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Apple ap=new Apple();
ap.red(50, "without seeds");
	}
public void red()
{
	System.out.println("simla apple is good");
}
public void red(int price)
{
	System.out.println("Apple price:"+price);
}
public void red(int price,String hybrid)
{
	System.out.println("Apple price :"+price);
	System.out.println("Apple name:"+hybrid);
}

}
