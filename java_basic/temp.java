/* A jagged array is irregular multi dimensional, in which we can have varying number of element for each
row*/ 

import java.util.*;
import java.lang.*;
import java.io.*;

class jag{
	public static void main(String la[]){
		int a[][] = new int[3][];
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size each sub-array :");
		for(int i=0;i<3;i++){
			int size=0;
			System.out.print((i+1)+"sub-array :");
			size=s.nextInt();
			a[i]=new int[size];
		}
		
		System.out.println("Enter the value for each sub-array :");
		for(int i=0;i<3;i++){
			System.out.println("Enter the values for "+(i+1)+" :");
			for(int j=0;j<a[i].length;j++){
	
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("The Data you enter :");
		for(int i=0;i<3;i++){
			System.out.print("The values of "+(i+1)+" sub-array:");
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
	}
}