package class_method_object;

public class CLASS_OBJECT_METHOD {
//class veriable 
	int eId;
	String eName;
	double sal;
	int deptno;
	String job;
	
	void display()
	{
		
		System.out.println(eId);
		System.out.println(sal);
		
		System.out.println(deptno);
		System.out.println(job);
	}
	
	
	
	
	public static void main(String[] args) {
		CLASS_OBJECT_METHOD emp1 =new CLASS_OBJECT_METHOD();
		
		emp1.eId=12345;
		emp1.eName="alamin khan";
		emp1.sal=90000.00;
		emp1.deptno=10;
		emp1.job="manager";
		emp1.display();
		
		CLASS_OBJECT_METHOD emp2 =new CLASS_OBJECT_METHOD();
		
		emp2.eId=123456;
		emp2.eName="alamin bepari";
		emp2.sal=90000.00;
		emp2.deptno=20;
		emp2.job="manager";
		emp2.display();
	}

}
