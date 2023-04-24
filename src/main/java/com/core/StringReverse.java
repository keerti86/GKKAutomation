package com.core;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name1="Hello Rama";
System.out.println(name1.length());
char ch[]=name1.toCharArray();
for(int i=ch.length-1;i>=0;i--)
{
	System.out.print(ch[i]);
}


	}

}
