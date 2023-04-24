package com.core;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> li=new ArrayList<String>();
li.add("rama");
li.add("murali");
li.add("gopi");
li.add("hari");
System.out.println(li);
li.add("rama");
li.add("gopi");
System.out.println(li);
System.out.println(li.get(3));
	}

}
