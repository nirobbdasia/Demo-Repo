package overloading_static_this;


public class Main_method_overloading {

void main (int a , int b) {
		
		System.out.println(a+b);
	}
	
	void main(int a , int b , int c) {
		
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
	
		
		Main_method_overloading t = new Main_method_overloading();
		t.main(10,30);
		
	

	}
	
	
	

}
