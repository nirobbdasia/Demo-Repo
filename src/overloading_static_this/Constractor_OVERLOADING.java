package overloading_static_this;

public class Constractor_OVERLOADING {

	Constractor_OVERLOADING(int a , int b)
	{
		
		System.out.println(a+b);
	}
	Constractor_OVERLOADING(int a , int b, int c){
		
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Constractor_OVERLOADING t=new Constractor_OVERLOADING(10,30);
		
		//Constractor_OVERLOADING t=new Constractor_OVERLOADING(10,30,70);
		
		Constractor_OVERLOADING t=new Constractor_OVERLOADING(10,20,30);
		
	}

}
