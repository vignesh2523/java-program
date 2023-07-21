import java.util.*;
class rpattern
{
public static void main(String[] args)  
	{         
	    int i,j;
		int h=6,w=5;
        int mid = h / 2;  
          
        for(i = 0; i < h; i++) 
		{  
            System.out.printf("*");  
            for(j = 0; j < w; j++)
				{  
                if((i == 0 || i == mid) && j < (w - 2)) 
				{  
                    System.out.printf("*");  
                }
				else if(j == (w - 2) && !(i == 0 || i == mid))
				{  
                    System.out.printf("*");  
                }
				else 
				{  
                    System.out.printf(" ");  
                }  
            }  
            System.out.printf("\n");  
        }  
    }
}