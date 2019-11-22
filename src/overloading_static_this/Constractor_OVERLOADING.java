package overloading_static_this;

public class Constractor_OVERLOADING {

	void main(int a ,int b ) {
		
		System.out.println(a+b);	 
	}
	
	void main (int a, double b) {
		
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Constractor_OVERLOADING t=new Constractor_OVERLOADING(10,30);
		
		//Constractor_OVERLOADING t=new Constractor_OVERLOADING(10,30,70);
		
		Constractor_OVERLOADING t=new Constractor_OVERLOADING();
		t.main(23,44);
	}

}
