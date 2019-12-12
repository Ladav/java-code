import java.io.PrintStream;
import java.util.Scanner;
class test7
{
	public static void main(String la[])
	{
		PrintStream p;
		p = new PrintStream(System.out);
		Scanner s;
		s = new Scanner(System.in);
		
		p.print("ENTER PASSWORD:");
		String str1 = s.nextLine();
		
		p.print("REENTER PASSWORD:");
		String str2 = s.nextLine();
		
		int res = str1.compareTo(str2);
		if(res==0)	p.print("login successfull.");
		else if(res>0)	p.print("str1 is greater than str2.");
		else p.print("str2 is greater than str1.");
		
	}
}