import java.util.*;
class large
{
  public static void main(String[] args)
  {
   int i,j,size,temp;
   int[] array={10,20,25,63,96,57};
   size=array.length;
   System.out.println(size);
   for(i=0;i<size;i++)
  {
    for(j=i+1;j<size;j++)
    {
      if(array[i]>array[j])
      {
        temp=array[i];
        array[i]=array[j];
         array[j]=temp;
}
}
}
System.out.println(Arrays.toString(array));
System.out.println("the second largest number is :  "+(array[array.length-2]));
}
}