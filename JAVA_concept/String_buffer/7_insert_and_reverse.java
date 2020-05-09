class Insert_and_Reverse
{
	public static void main(String la[])
	{
		StringBuffer sb = new StringBuffer("I you.");
		// inserting into the string
		sb.insert(2,"like ");		//0->I 1->_ 2->y so 2 mean at the place of y
		System.out.println("String:"+sb);
		// reversing the string
		System.out.print("String reversed:"+sb.reverse());
	}
}