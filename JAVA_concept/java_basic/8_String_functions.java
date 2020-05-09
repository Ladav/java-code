import java.io.PrintStream;
class test8
{
	public static void main(String la[])
	{
		PrintStream p;
		p = new PrintStream(System.out);
		
		String str = "this is the end.";
		
		p.println("String:"+str);
		p.println("length of the String:"+str.length());
		p.println("toUpperCase():"+str.toUpperCase());// this doesnot alter the actual String
		p.println("String:"+str);
		p.println("indexOf(''en''):"+str.indexOf("en"));//the first occurence
		p.println("lastIndexOf('i'):"+str.lastIndexOf('i'));
		p.println("charAt(3):"+str.charAt(3));
		p.println("startsWith(''this''):"+str.startsWith("this"));
		p.println("endsWith(''end''):"+str.endsWith("end"));
		p.println("endsWith(''end.''):"+str.endsWith("end."));
	}
}