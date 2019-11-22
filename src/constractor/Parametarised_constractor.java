package constractor;

public class Parametarised_constractor {
	
	int a ;
	int b;
	
	Parametarised_constractor(int x , int y){
		
		 a=x;
		 b=y;
		
	}
	
	void print(){
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parametarised_constractor T = new Parametarised_constractor(200,330);
		
		T.print();
		
		
		
	}

}
