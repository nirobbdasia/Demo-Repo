package overloading_static_this;

public class Overloading {

	int add(int a , int b) {
		
		return a+b;
	}
	
	void add(int a, int b,int c) {
		
		System.out.println(a+b+c);
	}
	
	void add(int a , double b)
	{
		System.out.println(a+b);
	}
	void add(double a , double b) {
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		Overloading tt = new Overloading();
		System.out.println(tt.add(12345,34343));
		
		tt.add(23,34,56);
		tt.add(2445.34,643.55);
	}

}
