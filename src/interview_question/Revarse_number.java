package interview_question;

import java.util.Scanner;

public class Revarse_number {

	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter a number ");
	
	
	int num =sc.nextInt();
	//1. using Algorithom
	/*int rev = 0;
	
	while(num !=0)
	{
		rev=rev*10+num%10;
		num=num/10;
		
	}
		*/
	// usng StringBuffer
	/*
	StringBuffer sb = new StringBuffer(String.valueOf(num));
	
	StringBuffer rev =sb.reverse();
	*/
	
	
	// usng StringBuilder
	StringBuilder sbl = new StringBuilder();
	
	sbl.append(num);
	StringBuilder rev =sbl.reverse();
	
	
	
	System.out.println("the reverse number is " + rev);
	}

}
