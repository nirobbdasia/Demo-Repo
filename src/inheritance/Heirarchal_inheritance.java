package inheritance;



class parent
{
	int a;
	
	void display() {
		
		System.out.println(a);
 }
}
class chaild1 extends parent {
	
	int b;
	
	void show() {
		
		System.out.println(b);
	}
}
	
class chaild2 extends parent {
	
	int c;
	
	void showt() {
		
		System.out.println(c);
	}
}
	


public class Heirarchal_inheritance {

	public static void main(String[] args) {
		
		chaild1 c1 =new chaild1();
		c1.a=100;
		c1.b=200;
		
		c1.display();
		c1.show();
		
		chaild2 c2= new chaild2();
		c2.a=300;
		c2.c=400;
		
		c2.display();
		c2.showt();
		

	}

}
