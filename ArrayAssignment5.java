import java.util.Scanner;

/**
 * Nmae:Girija Unnibhavi
 * Discription: compilation of java program to find the length of the longest consecutive element sequence
 * Date=03/18/2021
 */
public class ArrayAssignment5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elemenets in an array");
		int n=sc.nextInt();
		int[] X=new int[n];
		System.out.println("Enter elemenets of an array");
		for(int i=0;i<n;i++) {
			
			X[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++) {
		System.out.println(X[i]);
		}
		String arr=" ";
		int count=0;
		for(int i=0;i<n-1;i++) {
			
				if(X[i]+1==X[i+1])
				{
					
				count++;	
				}
				else
				{
					if(count>0)
					{
						arr+=Integer.toString(count+1);
						count=0;
					}
					count=0;
				}
		}
		if(count>0) 
			arr+=Integer.toString(count+1);
		
		char max=arr.charAt(0);
		for(int i=1;i<arr.length();i++)
		{
		if(arr.charAt(i)>max)
			max=arr.charAt(i);
		}
System.out.println("largest consecutive sequence length:");
System.out.println(+max-'0');
}
	
}
