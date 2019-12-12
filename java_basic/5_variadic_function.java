import java.lang.String;
class test5
{
	void sum (int...x)
	{
		int res=0,i;
		for(i=0;i<x.length;i++) res+=x[i];
		System.out.println("Sum:"+res);
	}
	public static void main(String la[])
	{
		test5 t = new test5();
		t.sum(9,7,9324,3223,223,123,-23);
		t.sum(2,3,4);
		t.sum(-32,-23,-232);
	}
}