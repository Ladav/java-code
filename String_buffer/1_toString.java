//toString is used to convert a string buffer into a string
class Convert_to_str
{
	public static void main(String la[])
	{
		StringBuffer sb = new StringBuffer("hey");		//sb is an object here
		System.out.println(sb);
		String s = sb.toString();
		System.out.print(s);
		
	}
}