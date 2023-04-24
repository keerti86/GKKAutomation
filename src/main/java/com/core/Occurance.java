package com.core;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hellow rama";
        char ch = 'l';
        int cnt = 0;
         
        for ( int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ch)
                cnt++;
        }
        System.out.println("Occurrences of "+ch+" are " +cnt);
	}

}
