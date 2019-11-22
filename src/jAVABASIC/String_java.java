package jAVABASIC;

public class String_java {

	public static void main(String[] args) {
		
		
		
		String s="string";
		String s1="welcome";
		String s2=" Alamin ";
		System.out.println(s.length());//lenght() -to get the length the string 
		
		System.out.println(s.concat(s1));//concat() -to join 2 diffrent strig 
		System.out.println(s2.trim());//Remove the right and left side space 
		
		//charAt():Return a char value at the given index number. The index number strats from 0
		
		System.out.println(s.charAt(4));
		
		//contains() searches the sequence of characters in the String . it Returns true or false 
		
		System.out.println(s.contains("str"));
		
		//equals(): Compares 2 given String bassed on the content of the string . if any character is not matching ,it returns false . if all characters are matched it returns true
		//case sensitive 
		System.out.println(s.equals("String"));
	
		
		//equalsIgnoreCase(): Compares 2 given String bassed on the content of the string . if any character is not matching ,it returns false . if all characters are matched it returns true
				//case sensitive 
				System.out.println(s.equalsIgnoreCase("String"));

		//replace():Returns a string ,replacing all the old characters charsequense to new character.there are 2 ways to replace the Methods 
	
				System.out.println(s1.replace('o','a'));
				
		//SubString() : Returns subString of a String based on string index and ending index.
		// Starting Index :Starting index (0)
		//Ending Index: (1)
				
				System.out.println(s.substring(0,4));
				
				
		//toLowerCase (); returns the String in lowercase latter.
		
				System.out.println(s.toLowerCase());
				
		////toUpperCase (); returns the String in Uppercase latter.		
				System.out.println(s.toUpperCase());
				
				
				
				
				
				
				
				
	
	}

}
