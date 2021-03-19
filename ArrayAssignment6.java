import java.util.Scanner;

/**
 * Nmae:Girija Unnibhavi
 * Discription: compilation of java program to take 20 integers from user input and print the following
 * number of positive numbers
 * number of negative numbers
 * number of odd numbers
 * number of even numbers
 * number of 0s
 * Date=03/18/2021
 */
public class ArrayAssignment6 {
	public static void main(String[] args) {
		int positiveNumbers=0;
		int negativeNumbers=0;
		int evenNumbers=0;
		int oddNumbers=0;
		int numberOf0s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elemenets of an array");
		//int n=sc.nextInt(5);
		int[] X=new int[20];
for(int i=0;i<20;i++) {
			
			X[i]=sc.nextInt();
			
		}
for(int i=0;i<20;i++) {
	System.out.println(X[i]);
	}
	
for(int i=0;i<20;i++) {
		
		if(X[i]>0)
		{
			positiveNumbers++;
		}
	}
for(int i=0;i<20;i++) {
	
	if(X[i]<0)
	{
		negativeNumbers++;
	}
}
for(int i=0;i<20;i++) {
	
	if(X[i]%2==0)
	{
		evenNumbers++;
	}
}
for(int i=0;i<20;i++) {
	
	if(X[i]%2!=0)
	{
		oddNumbers++;
	}
}
for(int i=0;i<20;i++) {
	
	if(X[i]==0)
	{
		numberOf0s++;
	}
}
System.out.println("Number of positive numbers "+positiveNumbers);
System.out.println("Number of negative numbers "+negativeNumbers);
System.out.println("Number of even numbers "+evenNumbers);
System.out.println("Number of odd numbers "+oddNumbers);
System.out.println("Number of 0s "+numberOf0s);

}
}
