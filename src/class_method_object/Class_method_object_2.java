package class_method_object;

public class Class_method_object_2 {

	int sId;
	String Sname;
	char grade;
	
	Class_method_object_2(int id , String name, char g) {
		
		sId=id;
		Sname=name;
		grade=g;
		
	}
	void getvalue(int id , String name, char g) {
		
		sId=id;
		Sname=name;
		grade=g;
	}
	
	void println() {
		
		System.out.println(sId+" "+Sname+" "+grade);
	}
	
}
