package com.core;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=10;
     int b=5;
     int c=6;
     int d=45;
     int e=55;
     int g=10;
     
     //Logical AND Operator
     System.out.println((a>b)&&(d>e));
     System.out.println((a>b)&&(d<e));
     System.out.println((b<g)&&(c>e));
     
     //logical OR Operator
     
     System.out.println((a>b)||(d>e));
     System.out.println((a>b)||(d<e));
     System.out.println((b<g)||(c>e));
	}

}
