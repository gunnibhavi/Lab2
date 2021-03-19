/**
 * Nmae:Girija Unnibhavi
 * Discription: compilation of java program to display sorted list of products name
 * Date: 03/16/2021
 */
import java.util.Arrays;

public class ArrayAssignment2 {
	public static void main(String[] args) {
		String[] product= {"Soap","Cream","Powder","Oil","Soap","Powder"};
		
		Arrays.sort(product,0,6);
		for(int i=0;i<product.length;i++)
		{
		System.out.println(product[i]);
	}

}
}
