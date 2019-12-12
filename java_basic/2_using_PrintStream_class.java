import java.io.*;
class tempo
{
	public static void main(String la[])
	{
		PrintStream p;
		p = new PrintStream(System.out);	
		p.print("Printed using object of class PrintStream rather using shortcut of global System class. ");
		p.print("ex-System.out.print().");
	}
}
/*the 'out' is an object of PrintStream class that why we access print(),println
and printf() without an object of PrintStream class explicitly