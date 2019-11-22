package inheritance;

class A 
{
	int a;
	
	void display() {
		
		System.out.println(a);
	}
}

class B extends A
{
	int b;
	
	void print() {
		
		System.out.println(b);
	}
	
}

public class Single_inheritance {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		A aobj =new A();
		aobj.a=100;
		aobj.display();
		*/
		
		B bobj =new B ();
		bobj.a=100;
		bobj.display();
		bobj.b=200;
		bobj.print();
		
	}

}
