package jAVABASIC;

public class TryCatch {

	public static void main(String[] args) {
		
		try
		{
		int [] a = {123,234,444};
		
		System.out.println(a[3]);
		}
		
		catch(Exception e)
		{
			System.out.println("An Exception happended");
		}
		
		try
		{
		
		int [] b = {23,34,45};
		
		System.out.println(b[7]);
		} 
		
	catch(NullPointerException e)
		{
		
		System.out.println("NULL PINT EXCEPTION");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("out of boundary exception");
		}
		
		catch(Exception e)
		{
			System.out.println("An Exception happended");
		}
	}

}
