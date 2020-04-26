package constractor;

public class Constractor_Value {

	int result;
	public static void main(String[] args) {
		

		Constractor_Value obj = new Constractor_Value(88);
		obj.displayResult();
	}

	public Constractor_Value(int marks) {
		result = marks;
	}
	
	public void displayResult() {
		
		System.out.println("Final mark for student is "+result);
	}
}
