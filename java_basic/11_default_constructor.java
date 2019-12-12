class t11
{
	t11()
	{
		System.out.println("default constructor invoked");
	}
	public static void main(String la[])
	{
		t11 t1 = new t11();
		t11 t2 = new t11();
		t1 = t2;	//testing if copy constructor exists ANS yes it is
		//but parameterized constructor doesn't exists t11 t3 = new t11(t2);
	}
}