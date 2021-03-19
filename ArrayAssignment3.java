/**
 * Nmae:Girija Unnibhavi
 * Discription: compilation of java program to test if an array contains specific value
 * Date: 03/14/2021
 */
import java.util.Scanner;
public class ArrayAssignment3 {
	private static int[] numbers= {1,2,3,4,5,6,7,8,9};
	private static int specificValue;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter specific value");
		Scanner sc=new Scanner(System.in);
		specificValue=sc.nextInt();
		
		System.out.println(test(numbers,specificValue));
	}
		public static boolean test(int number[],int specificvalue ) {
		for(int i :numbers)
		{
			if(specificValue==i)
			{
				return true;
			}
		}
				return false;
			}
}
		

	
	


