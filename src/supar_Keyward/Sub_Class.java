package supar_Keyward;

public class Sub_Class extends Parent_class {

	public static void main(String[] args) {
		
		Sub_Class obj= new Sub_Class("alamin");
		
	}

	public Sub_Class() {
		
		System.out.println("I am  In Sub Class Constractor");
	}
	
	public Sub_Class(String name) {
		super(name);
		System.out.println("I am  In Sub Class Constractor "+name);
	}
}
