package constractor;

public class Default_constractor {

	int x;
	int y;
	Default_constractor(){
		 x=100;
		y= 200;
	}
	
	void print() {
		
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		
		Default_constractor T = new Default_constractor();
		
		T.print();

	}

}
