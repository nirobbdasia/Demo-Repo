package constractor;

public class Constrctor_Demo1 {

	public static void main(String[] args) {
		
		Constrctor_Demo1 obj = new Constrctor_Demo1("TMKM");
		obj.DisplayResult();
	}
	
	
	public Constrctor_Demo1() {
		
		System.out.println("Hey welcome to School");
	}
	
	public Constrctor_Demo1(String SchoolName) {
		
		System.out.println("Hey welcome to School ,This is "+ SchoolName);
	}
	
	public Constrctor_Demo1(int rank) {
		
		System.out.println("Hey welcome to School ,School Rand is "+rank);
	}
	public Constrctor_Demo1(String SchoolName ,int rank) {
		
		System.out.println("Hey welcome to School");
	}
	
	public Constrctor_Demo1(int rank , String SchoolName ) {
		
		System.out.println("Hey welcome to School");
	}
	public void DisplayResult() {
		
		System.out.println("MARKS ARE 90");
	}

}
