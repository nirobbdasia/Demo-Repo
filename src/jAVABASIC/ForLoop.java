package jAVABASIC;

public class ForLoop {

	public static void main(String[] args) {
		
	for(int i=0;i<5;i++)
	{
		System.out.println("i love you");
	}

	
	for(int i =0;i<=5;i++)
	{
		System.out.println(i);
	}

	
	int [] arrayi = {123,234,454};
	
	for(int i =0; i<arrayi.length;i++) {
		
		System.out.println(arrayi[i]);
	}
	
	
	int [] atm =new int[3];
	
	atm [0]=23;
	atm[1]=35;
	atm[2]=34;
	
	for(int i =0;i<atm.length;i++) {
		System.out.println(atm[i]);
	}
	
	
	
	
	
	
}
}