package interview_question;

public class Reverse_string {

	public static void main(String[] args) {
	
		
		String str ="ABCD";
		
		int len =str.length();
		
		String rev =" ";
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		
	for(int i = len-1;i>=0;i--)
	{
		rev= rev+str.charAt(i);
	}
		
	
		
	System.out.println(rev);
	
	
	char a[] =str.toCharArray();
	
	int lent=a.length;
	for(int t =lent-1;t>=0;t--)
	{
		rev=rev+str.charAt(t);
		
	}
	System.out.println(rev);
	
	}

}
