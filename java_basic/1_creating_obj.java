import java.util.Scanner;
class test
{
	int roll;
	String name;
	Scanner s = new Scanner(System.in);
	
	void setdata()
	{
		System.out.println("Enter roll no and name:");
		roll = s.nextInt();
		name = s.next();
	}
	void getdata()
	{
		System.out.println("name:"+name+" roll no:"+roll);
	}
	
	public static void main(String la[])
	{
		test t;
		t = new test();
		t.setdata();
		t.getdata();
	}
}