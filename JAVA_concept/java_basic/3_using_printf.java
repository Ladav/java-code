import java.io.*;
import java.util.Scanner;

class test3
{
	public static void main(String la[])
	{
		Scanner s = new Scanner(System.in);
		PrintStream p = new PrintStream(System.out);
		int x;
		float y;
		p.print("Enter Integer:");
		x = s.nextInt();
		
		p.printf("x:%d\n",x);
		p.printf("octal x:%o\n",x);
		p.printf("hexa x:%x\n",x);
		
		p.print("Enter Float:");
		y = s.nextFloat();
		p.printf("float y:%f\n",y);
		p.printf("Scientic y:%e\n",y);
	}
}