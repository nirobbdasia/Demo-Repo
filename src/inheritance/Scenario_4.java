package inheritance;

public class Scenario_4 extends Base_Class {

	public static void main(String[] args) {
		
		Base_Class obj = new Base_Class();
		obj.Add();
		obj.Sub();
		
		//We can not Call Senario 2 class methods because we created the Method of Parent class
		
	}

public void Multiply() {
		
		System.out.println("This is Multiply Result 500");
	}
	
public void Division() {
		
		System.out.println("This is Multiply Result 50");
	}
}
