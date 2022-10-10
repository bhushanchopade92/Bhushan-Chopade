
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, sum=0,temp;
		
        int y= 34543;  // 
        
        temp=y;
        
        while(y>0)
        {
        	
        	x= y%10;
        	
        	sum=(sum*10)+x;
        	
        	y=y/10;
        	
        	
        }
          if(temp==sum) 
          {
        	  System.out.println("Number is Pandrome");
          }
          else
          {
        	  System.out.println("not pandrome");
          }     
	}
}
