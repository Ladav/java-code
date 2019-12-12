class test6
{
	public static void main(String la[])
	{
		int iarr[]={1,2,3,4,5};
		//	char carr[]="abcde"; will be an error
		char carr[]={'a','b','c','d','e','\0'};
		
		for(int x:iarr)
			System.out.print(x+"\t");		// \t ascii value is 9
		
		System.out.println();
		
		for(char x:carr)
			System.out.print(x+"\t");
		
	}
}