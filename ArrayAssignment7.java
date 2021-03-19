import java.util.Scanner;

/**
 * Nmae:Girija Unnibhavi
 * Discription: compilation of java program to return the second largest element in an array of integer type
 * Date=03/18/2021
 */
public class ArrayAssignment7 {
	
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
		
		System.out.println("smallest number is:"+getSecondSmallestt(X,n));
	}
	
	
	public static int getSecondSmallestt(int[] X,int n) {
		
		int temp=0;
		
for(int i=0;i<n;i++) {
	for(int j=i+1;j<n;j++)
	{
		if(X[i]<X[j]) {
			temp=X[i];
			X[i]=X[j];
			X[j]=temp;
	}
		
	}
}
return X[1];

}


}
