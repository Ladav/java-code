/* capacity of object tell us about the reserve memory(16 bytes by default)
 given to object which can be reallocated */
import java.io.PrintStream;
class cap
{
	public static void main(String la[])
	{
		PrintStream p = new PrintStream(System.out);
		StringBuffer sb = new StringBuffer("this is the end.");
		
		p.println("Original string:"+sb);
		//checking capacity
		p.println("the memory allocated to the object: "+sb.capacity());
		//checking length
		p.println("the length or number of characters in the object: "+sb.length());
		//forcing reallocation
		sb.append("hold your breath and count till 10 feel the earth moving and then heat y heart burst again");
		p.println("\nAltered string:"+sb);
		//checking capacity
		p.println("the memory allocated to the object: "+sb.capacity());
		//checking length
		p.println("the length or number of characters in the object: "+sb.length());
	}
}