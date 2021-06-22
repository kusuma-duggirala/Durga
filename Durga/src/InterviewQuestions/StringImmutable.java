package InterviewQuestions;

public class StringImmutable 
{
	static String s="Kusuma";
	//static String s=new String("Kusuma");  //Line 5 and 6 gives same output
	static StringBuffer sb;
	static StringBuilder sbd;
	static String s2;
	
	public static void main(String[] args) 
	{
		s.concat("Duggirala"); //New object is created with value "KusumaDuggirala". Since it is not assigned any variable, becomes eligible for garbage collection
		System.out.println("String: "+s); //Object s point to "Kusuma" hence prints the value.
		s2=s.concat("Duggirala"); //KusumaDuggirala
		System.out.println("String after assingning the to the different object: "+s2);
		
		sb=new StringBuffer("Kusuma");
		sb.append("Duggirala");
		System.out.println("String Buffer: "+sb);
		
		sbd=new StringBuilder("Kusuma");
		sbd.append("Duggirala");
		System.out.println("String Builder: "+sbd);
		
	}

}
