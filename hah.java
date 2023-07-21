import java.util.*;
class tictactoe
{
public static void main(String[] args) 
{
	int n=5;
     for (int i = 0; i < 5; i++)
     {
		 if(i%2==0)
		 {
            for (int j = 0; j < 5; j++) 
            {
				if(j%2==0)
				{
					System.out.print("x ");

				}
				else
				{
					System.out.print("o ");
				
				}
				
            }
		
		 }
		 
			else{
				for(int j=0;j<5;j++)
				{
					if(j%2==0)
					{
						System.out.print("o ");
					}
					else
					{
						System.out.print("x ");
					}
           
     }
	
}
System.out.println();
	 }
	 
}
}
