// demonstrating setLength(int), char charAt(int),void setCharAt(int, char);
class setLength_and_charAt
{
	public static void main(String la[])
	{
		StringBuffer sb = new StringBuffer("abcd");
		System.out.println("orignal String:"+sb);
		// charAt()
		System.out.println("charAt(0):"+sb.charAt(0));
		// serCharAt
		System.out.println("setCharAt(1,'r')");
		sb.setCharAt(1,'r');
		System.out.println("Altered String:"+sb);
		// setLength()
		sb.setLength(3); 	// new sb = "abc"
		System.out.println("new String:"+sb);
	}
}