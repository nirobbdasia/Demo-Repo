package jAVABASIC;

public class JumpStatement {

	public static void main(String[] args) {
		
	/*
		for (int i =1;i<10;i++) {
			
			if (i==5) {
				
				break;
			}
			
			System.out.println(i);
		}
		*/
		
		for (int m=1;m<=10;m++)
		{
			if (m==6 || m==7 || m==8) {
				
				continue;
			}
			
			System.out.println(m);
		}
		/*
		int t =1;
		
		while(t<=10) {
			
			if(t==5) {
				continue;
			}
			
			System.out.println(t);
			t++;
		}
		*/
		

	}

}
