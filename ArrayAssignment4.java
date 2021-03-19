/**
 * Nmae:Girija Unnibhavi
 * Discription: compilation of java program to covert arraylist to array
 * Date: 03/16/2021
 */
import java.util.ArrayList;
public class ArrayAssignment4 {

	public static void main(String[] args) {
		
		ArrayList<String>a1=new ArrayList<String>();
		a1.add("A"); 
		a1.add("B"); 
		a1.add("C"); 
		a1.add("D"); 
		a1.add("E");
		
		Object[] X=a1.toArray(new String[a1.size()]);
		 
		for(Object Y:X)
		{
		System.out.print(Y +"\t");
		}
		

	}

}
