package inheritance;


class M 
{
	int a =10;
	
	void display()
	{	
		System.out.println(a);
	}
	
}
class N extends M

{
	int b =200;
	
	void printti()
	{
		System.out.println(b);
	}
	
}

class O extends N

{
	int c =200;
	
	void print()
	{
		System.out.println(c);
	}
	
}



public class Multlavel_Inheritance {

	public static void main(String[] args) {
		
		
		O cobj= new O();
		
		cobj.display();
		cobj.printti();
		cobj.print();
		

	}

}
