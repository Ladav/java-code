// delete(int start, int end-1) deletes a string
// deleteCharAt(int loc); deletes a single character

class delete
{
	public static void main(String la[])
	{
		StringBuffer sb = new StringBuffer("this is the end.");
		System.out.println("original String :"+sb);
		// deleting char 3->s (because 0->t)
		sb.deleteCharAt(3);
		System.out.println("After deleting a character 's':"+sb);
		// deleting "the " from sb="thi is the end"; (s removed)
		sb.delete(7,11);
		System.out.println("after deleting string 'the ' :"+sb);
	}
}