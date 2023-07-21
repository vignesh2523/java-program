import java.util.*;
class Solution {
public boolean rotateString(String s, String goal) 
{
    return (s.length()==goal.length() && (s+s).contains(goal));
}
public static void main(String[] args)
	{
		Solution lead = new Solution();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Char arr[] = new Char[n];
		int i;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextLine();
		}
		lead.rotateString(arr, n);
	}
}