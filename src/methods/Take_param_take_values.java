package methods;

public class Take_param_take_values {

	
	int math(int a , int b ) {
		
		return(a+b);
	}
	
	public static void main(String[] args) {
	
		Take_param_take_values t = new Take_param_take_values();
		
	int sum =	t.math(200, 300);
		
		System.out.println(sum);

		
		System.out.println(t.math(200, 300));
	}

}
