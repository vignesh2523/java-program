import java.util.*;
class unit  
{   
    public static void main(String args[])   
    {   
		Scanner sc= new Scanner(System.in);
        int units = sc.nextInt();   
        double billToPay = 0;  
        if(units <= 100)  
        {  
            billToPay = units * 1;  
        }
        else if(units >= 101 && units <= 200)
		{  
            billToPay = 100 * 1 + (units - 100) * 2.50;  
        }  
        else if(units >= 201 && units <=500)  
        {  
            billToPay = 100 * 1 + 200 * 2.50 + (units - 200) * 4;  
        }
		else  
        {  
            billToPay = 100 * 1 + 100 * 2.50 + 300 * 4 + (units - 500) * 6;  
        } 		
        System.out.println("The electricity bill for " +units+ " is : " + billToPay);   
    }   
}   