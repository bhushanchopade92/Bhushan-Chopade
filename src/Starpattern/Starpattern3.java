package Starpattern;

public class Starpattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	*
	//	  **
	//	 ***
	//	****

		for(int i=0; i<=4; i++)
		{
			
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for( int k=1;k<=i;k++)
			{
				System.out.print(" *");    // remove space before * to genertae diff outpit
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
