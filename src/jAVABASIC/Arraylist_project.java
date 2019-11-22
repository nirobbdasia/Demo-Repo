package jAVABASIC;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Arraylist_project {

	public static void main(String[] args) {
//		
//		String [] fruits = new String [3];
//		fruits[0]="apple";
//		fruits[1]="orange";
//		fruits[2]="strawbery";
//		System.out.println(fruits[1]);
//		
//		int[] number = new int[4];
//		
//		number [0]=123;
//		number [1]=232;
//		number [2]=444;
//		number [3]=555;
//		System.out.println(number[0]);
//		System.out.println(number.length);
//
//		
//		ArrayList fruitList = new ArrayList();
//		
//		fruitList.add("apple");
//		fruitList.add("orange");
//		fruitList.add("jackfruit");
//		fruitList.add("grape");
//		fruitList.add("pineapple");
//		fruitList.add("Banana");
//		fruitList.remove("orange");
//		//fruitList.clear();
//		System.out.println(fruitList.contains("apple"));
//		
//		
//		System.out.println(fruitList);
//		
//		
//		
//		String [] Names = new  String[3];
//		Names [0]="Ayesha";
//		Names [1]="alamin";
//		Names [2]="abdullah";
//		
//		System.out.println(Names[0]);
//		
//		ArrayList Namers = new ArrayList();
//		Namers.add("Alamin");
//		Namers.add("Ayesha");
//		Namers.add("love");
//		System.out.println(Namers);
//		
//		
//		int [] array = new int[3];
//		
//		array[0]=123;
//		array[1]=234;
//		array[2]=345;
//		
//		System.out.println(array[2]);
//		
//		
//		ArrayList Arrayt= new ArrayList();
//		
//		Arrayt.add(123);
//		Arrayt.add(234);
//		Arrayt.add(345);
//		System.out.println(Arrayt.contains(555));
//		
//		
//		System.out.println(Arrayt);
		//Advanced for loop/enhanced for loop is specially for Array,Array list,HashMap
		
		/*int a []= {100,200,300,400};
		
		for(int i:a)
		{
			System.out.println(i);
		}
		/*
		int a []= {100,200,300,400};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		*/
		
		//Two dimantional Array 
		
		int M [][]=new int [3][2];
		
		M[0][0]=100;
		M[0][1]=200;
		
		M[1][0]=300;
		M[1][1]=400;
		
		M[2][0]=600;
		M[2][1]=700;
		
		//int M []= { {100,200},{300,400},{500,600} };
		System.out.println("Number of Rows = "+M.length);
		
		System.out.println("Number of Column = "+M[0].length);
		
		for (int i=0;i<M.length;i++)//OUTER Loop
		{
			
			for (int j=0;j<M[i].length;j++) { //Inner Loop
				
				System.out.println(M[i][j]);
			}
		}
		
		System.out.println("Enhanched for loop");

		
		for (int r[]:M) {
			
			for(int l:r) {
				System.out.println(l);
			}
		}
		
	}	

}
