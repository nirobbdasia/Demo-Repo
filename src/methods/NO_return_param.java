package methods;

public class NO_return_param {

	void param(int a, int b)
	{
		
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		NO_return_param t = new NO_return_param();
		
		t.param(100,200);

	}

}
