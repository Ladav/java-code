//incomplete

// accessing, inserting and modifying String
import java.io.PrintStream;
class operations
{
	public static void main(String la[])
	{
		PrintStream p = new PrintStream(System.out);
		StringBuffer sb = new StringBuffer("this is the end.");
		
		p.println("Original string:"+sb);
		//checking length
		p.println("the length of the string is "+sb.length());
		//accessing
		for(int i=0 ; i <16 ; i++)
			p.println("char at position :"+(i+1)+" is :"+sb.chatAt(i));
	}
}