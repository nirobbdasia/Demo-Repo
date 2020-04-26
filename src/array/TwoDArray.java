package array;

public class TwoDArray {

	public static void main(String[] args) {
		
		int School[][]= new int[2][2];
		
		School[0][0]=100;
		School[0][1]=200;
		School[1][0]=300;
		School[1][1]=400;
		
		System.out.println(School[1][1]);
		
		int size_of_Array= School.length;
		
		/*
		for (int i =0;i<size_of_Array;i++) {
			
			System.out.println(School[i][i]);
		}
		*/
	}

}
