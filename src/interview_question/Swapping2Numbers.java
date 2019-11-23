package interview_question;

public class Swapping2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =10;
		int b=20;
		
		System.out.println("before swapping "+a+" "+b);
		
		//Logic =1 Third variable
		
	/*	
		int t=a; 		
		a=b;
		b=t;
		*/
		//Logic2 using + & -    without using third veriable 
		/*
		a=a+b;
		b=a-b;
		a=a-b;
		*/
		
		
		/*			//
		a =a*b;
		b=a/b;
		a=a/b;
		
		*/
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		//bitwise XOR(^) 
		/*a=a^b;
		b=a^b;
		a=a^b;
		// Logic 5 Single statement 
		*/
		/*
		b=a+b-(a=b);
		*/
		System.out.println("after swapping "+ a + " "+b);
		
	}

}
