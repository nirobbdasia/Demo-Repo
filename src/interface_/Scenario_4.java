package interface_;

public class Scenario_4 implements Calc{

	public static void main(String[] args) {
		
		//Calc obj = new Calc();//Invalid scenario
		
		//You can not create object  of an Interface
		
		
		
	//	Scenario_4 obj =new Calc(); invalid
		
		//You can not create object  of an Interface because it has abstract method
		
	}

	
	public void sine() {
		
	}
	public void cos() {
		
	}
	@Override
	public void add() {
		
		System.out.println("This is add method in sempal 2 from base class ");
		
	}

	@Override
	public void sub() {
		
		
		System.out.println("This is sub mathod in base class in base classs");
		
	}

}
