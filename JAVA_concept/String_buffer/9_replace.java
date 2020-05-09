class Replace
{
	/*public static void main(String la[])
	{
		StringBuffer sb = new StringBuffer("I love you");
		System.out.println("String:"+sb);
		// replacing love with hate
		sb.replace(2,6,"hate");
		System.out.print("String:"+sb);
	}*/
	public static void main(String la[])
	{
		String sb = new String("I love you");
		System.out.println("String:"+sb);
		// replacing love with hate
		sb = sb.replace('l','e');
		System.out.print("String:"+sb);
	}
}