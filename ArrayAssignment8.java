import java.util.Arrays;

/**
 * Nmae:Girija Unnibhavi
 * Discription: compilation of java program to convert array elements to uppercase
 * Date=03/18/2021
  */
public class ArrayAssignment8 {
	private static String[] arr= {"Soap","Sugar","Teapowder","Oil","Soap","Teapowder"};
	public static void main(String[] args) {
		
		sort();
		upperCase();

	}
	public static void sort()
	{
		Arrays.sort(arr,0,6);
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		
	}
}
	public static void upperCase() {
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = arr[i].toUpperCase();
			System.out.println(arr[i]);
		}
	}
}
