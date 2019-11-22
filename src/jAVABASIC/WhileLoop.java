package jAVABASIC;

import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		/*int i =2;
		
		while (i<=10)
		{
			System.out.println(i);
			i+=2;
		}*/
		
		
		// ODD Number
		/*int i =1;
		
		while(i<=10)
		{
			System.out.println(i);
			i+=2;
		}
		
		
		//Desending order 
		int i =10;
		
		while(i>0)
		{
			System.out.println(i);
			i--;
		}
		
		System.out.println("do while loop");
		int x =1;
		do
		{
			System.out.println(x);
			x++;
		}
		while(x<=10);
			
				*/
		
		
	/*	
		int i = 20;
		do
		{
			System.out.println(i);
			i++;
		}
		while(i<=10);
		
		*/
		
		for (int i =10;i>0;i--)
		{
			System.out.println(i);
		}
		
		
		String stm = "this is the time";
		
		Scanner scn = new Scanner(stm);
		
		ArrayList <String> words= new  ArrayList<String>();
		
		while(scn.hasNext()) {
			
			words.add(scn.next());
		}
		
		System.out.println(words);
		
		
		
		
		
		
		
		
		
		
		
	}

}
