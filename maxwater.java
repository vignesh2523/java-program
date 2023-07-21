import java.util.*;
class maxwater
{
	static int max(int arr[],int n)
	{
		int m=0;
		int right=n-1;
		int left=0;
        while(left<right)
		{			
		int res=Math.min(arr[left],arr[right])*(right-left-1);
		m=Math.max(m,res);
		if(arr[left]< arr[right])
		{
			left++;
		}
		else
		{
			right--;
		}
		}
		return m;
	}
	public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n];
	int i;
	for(i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.print(max(arr,n));
}
}