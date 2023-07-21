class Solution {
public boolean rotateString(String s, String goal) 
{
    return (s.length()==goal.length() && (s+s).contains(goal));
}
public static void main(String[] args)
	{
		solution lead = new Solution();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new Char[n];
		int i;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextLine();
		}
		lead.printLeaders(arr, n);
	}
}