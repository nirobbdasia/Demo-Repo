package jAVABASIC;

import java.util.HashMap;

public class HashmapAwsome {

	public static void main(String[] args) {
		
		
		
		HashMap<String,Integer> happy = new HashMap<String,Integer>();
		
		happy.put("a",10);
		happy.put("b",30);
		happy.put("c",88);
		
		//System.out.println(happy);
		System.out.println(happy);

		
		HashMap <String,String> fun = new HashMap <String,String>();
		
		fun.put("bobyy","fluffypoint");
		fun.put("string","tinekwlenowne");
		fun.put("ieowoooweij","timewswoifoj");
		//fun.remove("bobyy");
		
		
		//System.out.println(fun.containsValue("timewswoifoj"));
		System.out.println(fun.replace("bobyy","Time is out"));
		System.out.println(fun.keySet());
		System.out.println(fun.values());
		System.out.println(fun);
		
		
		HashMap<String,String> mamunvai =new  HashMap<String,String> ();
		
		mamunvai.put("time","password1");
		mamunvai.put("ride","needapassword");
		mamunvai.put("m33","restPassword");
		
		System.out.println(mamunvai.replace("m33","this is replacementof old passsword"));
		System.out.println(mamunvai);
		
		
	}

}
