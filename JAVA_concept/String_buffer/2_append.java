class append
{
	public static void main(String la[])
	{
		StringBuffer sb = new StringBuffer("this is");
		System.out.println("before:"+sb);
		sb.append(" the end.");
		System.out.println("after:"+sb);
	}
}