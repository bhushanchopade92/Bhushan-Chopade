package ControlStatements;

public class Nestedforloopc {

	public static void main(String[] args) {

		for(int i=0; i<5 ;i++)
		{
			System.out.println("i = "+i);
			for (int j=0; j<3;j++)
			{
				System.out.println("j = "+j);
				if(i==2 & j==2)
				{
					System.out.println("hello");
					break;
					
				}
				
			}
		}
		
		
		
		
		
	}

}
