package methods;

public class returnvalue_no_param {

	int x =100;
	int y =200;
	
	int sum()
	{
		
		return(x+y);
	}
	
	public static void main(String[] args) {
		
		returnvalue_no_param p1=new returnvalue_no_param();
		
	int sal = p1.sum();
	System.out.println(sal);
	}

}
