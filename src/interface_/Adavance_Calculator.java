package interface_;

public class Adavance_Calculator implements Calc{
//Child Class Reference and child class object -This will
//Allow to access all the methods of base class and child class
	public static void main(String[] args) {
		
		System.out.println("Value defined in Interface "+x);

		
		Adavance_Calculator obj = new Adavance_Calculator();
		obj.add();
		obj.Calculatecos();
		obj.Calculatesine();
		obj.sub();
		
	}
	
	public void Calculatesine() {
		
		System.out.println("Calculator sine");
	}

	public void Calculatecos() {
		
	System.out.println("Calculator Cose");
	}
	
	@Override
	public void add() {
		System.out.println("I am in Addition");
		
	}

	@Override
	public void sub() {
		
		System.out.println("I am in Subtraction");
	}

}
