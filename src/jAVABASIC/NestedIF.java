package jAVABASIC;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NestedIF {

	public static void main(String[] args) {
		
		int day = 9;
		
		if (day ==1)
		{
			System.out.println("saturday");
		}
		else if (day ==2)
			
		{
			System.out.println("sunday");
		}
		else if(day ==3)
		{
			System.out.println("monday");
		}
		else if(day ==4)
		{
			System.out.println("tuesday");
		}
		else if(day ==5)
		{
			System.out.println("Wednesday");
		}
		else if(day ==6)
		{
			System.out.println("thursday");
		}
		else if(day ==7)
		{
			System.out.println("friday");
		}
		
		else 
		{
			System.out.println("Invalid week");
		}
		
		Date ct = new Date();
		System.out.println(ct);
		
		SimpleDateFormat timeformat = new SimpleDateFormat("hh:mm:ss");
		System.out.println(timeformat.format(ct));
		
		SimpleDateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
		
		System.out.println(dateformat.format(ct));

	}

}
