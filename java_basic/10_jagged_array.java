import java.util.Scanner;
class t10
{
	public static void main(String la[])
	{
		Scanner s = new Scanner(System.in);
		int[][] arr = new int[3][];
		System.out.println("Enter size for  sub-arrays:");
		//creating jagged array
		for(int i=0;i<3;i++){
			System.out.print((i+1)+" sub-array:");
			int size = s.nextInt();
			arr[i] = new int[size];
		}
		//input data
		for(int i=0;i<3;i++){
			System.out.println("Enter data for "+(i+1)+" array:");
			for(int j=0;j<arr[i].length;j++)
				arr[i][j] = s.nextInt();
		}
		//output data	
		System.out.println("Data you entered---->");
		for(int i=0;i<3;i++){
			System.out.print((i+1)+" array:");
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j]+"\t");
			System.out.println();
		}
	}
}