package overloading_static_this;

public class Static_method {

	
	// Static ---> applicable for variable and method 
	
	//Static  variable & Static methods 
	
	//1.static method can only access static stuff(direct access) without creating object 
	//2.static method can access NON static stuff but through creating object
	//3.Non static methods can access both static and non static stuff directly without creating any object
	static int a =100;
	int b =20;
	static void m1() {
		
		System.out.println("this is m1 static method");
	}
	
	void m2() {
		
		System.out.println("this m2 non static method");
	}
	
	void m3() { 
		//3.Non static methods can access both static and non static stuff directly without creating any obj
		
		System.out.println("this is m3 non static method");
		System.out.println(a);
		System.out.println(b);
		
		m1();
		m2();
		
	}
	
	public static void main(String[] args) {
		
		//1.static method can only access static stuff(direct access) without creating object 
		System.out.println(a);
		m1();
		
		//2.static method can access non static stuff but through creating object
		Static_method obj = new Static_method();
		System.out.println(obj.b);//NON static variable through object 
		obj.m2();// non static method through object
		
		obj.m3();
		
		
	}

}
