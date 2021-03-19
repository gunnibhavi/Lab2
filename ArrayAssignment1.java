/**
 * Nmae:Girija Unnibhavi
 * Discription: compilation of java program to display duplicate values
 * Date: 03/16/2021
 */
public class ArrayAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] productList= {"Soap","Sugar","Teapowder","Oil","Soap","Teapowder"};
		for(int i=0;i<productList.length;i++)
			for(int j=i+1;j<productList.length;j++)
		{
				if(productList[i].equals(productList[j])) {
		System.out.println(productList[j]);
        
	}
				}
}
}
