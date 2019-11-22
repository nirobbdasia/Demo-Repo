package class_method_object;

public class This_keyWord {

	int a ; //instance veriable or class veriable 
	int b ;
	
	void add(int a , int b) //  method veriable or external veriable
	{
		
		this.a=a; //this keyword means it belongs to class 
		 this.b=b;
		
		
	}
	
	void display() {
		
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {

		
		This_keyWord t = new This_keyWord();
		
		t.add(20, 20);
		t.display();
		
		
		
	}

}
