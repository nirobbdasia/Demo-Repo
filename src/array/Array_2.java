package array;

public class Array_2 {

	public static void main(String[] args) {
		
		
		int students_id[] = new int[5];
		
		students_id[0]= 89;
		students_id[1]= 894;
		students_id[2]= 893;
		students_id[3]= 892;
		students_id[4]= 859;
		
	int size_of_Array =	students_id.length;
		System.out.println("Student id is :"+students_id[4]);
	
		System.out.println("Student id is :"+size_of_Array);
		
		
		for (int i =0;i<size_of_Array;i++) {
			
			System.out.println("Student ID is "+students_id[i]+" In position Of "+i);
		}
		
		/*while(i<size_of_Array) {
			System.out.println(students_id[i]);
			size_of_Array++;
		}
		*/
	}

}

// Can not Define more than defined number of values(size)
// can not take diffrent Type of Valuse