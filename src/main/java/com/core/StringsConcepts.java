package com.core;

public class StringsConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String name1="rama";
   String name2="laxman";
   String name3="murali";
   String name4="krishna";
   String name5="akhil";
   String name6="RAMA";
   String name7="  sita  hanuma  ";
   System.out.println(name6.toLowerCase());
   System.out.println(name1.concat(name2));
   System.out.println(name1.equals(name3));
   System.out.println(name1.equals(name6));
   System.out.println(name1.equalsIgnoreCase(name6));
   System.out.println(name4.contains("n"));
   System.out.println(name5.endsWith("l"));
   System.out.println(name3.startsWith("m"));
   System.out.println(name4.charAt(2));
   System.out.println(name2.length());
   System.out.println(name3.toCharArray());
   System.out.println(name5.hashCode());
   System.out.println(name4.isEmpty());
   System.out.println(name7.trim());
   
  

   
	}

}
