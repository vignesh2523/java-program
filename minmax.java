import java.util.*;
class GFG
{
	static void rearrange(int[] arr, int n)
	{
		int temp[] = arr.clone();
		int small = 0, large = n - 1;
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			if (flag)
				arr[i] = temp[large--];
			else
				arr[i] = temp[small++];

			flag = !flag;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Original Array ");
		System.out.println(Arrays.toString(arr));

		rearrange(arr, n);

		System.out.println("Modified Array ");
		System.out.println(Arrays.toString(arr));
	}
}
