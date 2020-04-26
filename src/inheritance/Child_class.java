package inheritance;

public class Child_class extends Base_Class {

	public static void main(String[] args) {
		
		Child_class obj = new Child_class();
		
		obj.Add();
		obj.Sub();
		obj.Multiply();
		obj.Division();
		
		
		

	}

	public void Multiply() {
		
		System.out.println("This is Multiply Result 500");
	}
	
public void Division() {
		
		System.out.println("This is Multiply Result 50");
	}
}
