import java.util.Scanner;
class eachvowel
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     char[] a=s.toCharArray( );
      int size=a.length;
      int i,count=0,cnt1=0,cnt2=0,cnt3=0,cnt4=0,cnt5=0;
      for(i=0;i<size;i++)
      {  
         if(a[i]=='a'  || a[i]=='e'  || a[i]=='i'  || a[i]=='o'  || a[i]=='u')
         { 
            count++;
         }
    }
for(i=0;i<size;i++)
      {  
         if(a[i]=='a' )
         { 
            cnt1++;
         }
    }
for(i=0;i<size;i++)
      {
         if(a[i]=='e' )
         { 
            cnt2++;
         }
    }
for(i=0;i<size;i++)
      { 
         if(a[i]=='i' )
         { 
            cnt3++;
         }
    }
for(i=0;i<size;i++)
      {  
         if(a[i]=='o' )
         { 
            cnt4++;
         }
    }
for(i=0;i<size;i++)
      {   
         if(a[i]=='u' )
         { 
            cnt5++;
         }
    }  
  System.out.println(+count);
   System.out.println(+cnt1);
  System.out.println(+cnt2);
  System.out.println(+cnt3);
  System.out.println(+cnt4);
  System.out.println(+cnt5);
}
}