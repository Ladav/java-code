/*obj.getChars(int start, int end, String target[], int numberofspacesAddedToFront);
make a substring by copying data from obj to target string array*/

class getCharString
{
	public static void main(String la[])
	{
		StringBuffer sb = new StringBuffer("this is the end.");
		char s[] = new char[3];
		sb.getChars(2, 4, s,0);
		System.out.println(s);
	}
}