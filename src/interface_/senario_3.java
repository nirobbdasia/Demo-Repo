package interface_;

public class senario_3 implements Calc{
//Base class instance and 
	public static void main(String[] args) {
		
		Calc obj = new senario_3();
		obj.add();
		obj.sub();
	

	}

	
	public void sine() {
		
	}
	
	public void cos() {
		
		
	}
	@Override
	public void add() {
		
		System.out.println("Hellow ");
	}

	@Override
	public void sub() {
		
		System.out.println("world");
	}

}
