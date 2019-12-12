import java.util.*;
class wrap
{
	public static void main(String la[])
	{
		Scanner s = new Scanner(System.in);
		Integer id = new Integer(0);
		Integer pass = new Integer(0);
		String temp = new String();
		System.out.println("Enter id and password:");
		temp = s.next();
		id = Integer.parseInt(temp);
		temp = s.next();
		pass = Integer.parseInt(temp);
		System.out.println("id and password:"+id+" "+pass);
	}
}