package com.core;

public class StringReverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str="my name is keerthi";
		String[] words=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	   System.out.println(reverseWord.trim());
	    
				
			}
		}
		
		
		 
