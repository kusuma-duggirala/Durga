package InterviewQuestions;

public class Equals 
{
	static String s1="Hello"; 
	static String s2="Hello";
	
	static String s3=new String("Hello"); 
	static String s4=new String("Hello");
	
	public static void main(String[] args) 
	{
		System.out.println(s1==s2);         //true
		System.out.println(s1.equals(s2));  //true
		
		System.out.println(s3==s4);         //false -- Reference Comparison
		System.out.println(s3.equals(s4));  //true  -- Content Comparison         /
	}
}
