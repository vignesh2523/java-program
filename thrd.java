import java.util.Arrays;
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
        
        Thread t1 = new Thread(() -> {
            double sum = Arrays.stream(a).sum();
            double avg = sum / n;
            System.out.println("Average: " + avg);
        });
        
        Thread t2 = new Thread(() -> {
            int max = Arrays.stream(a).max().getAsInt();
            System.out.println("Maximum: " + max);
        });
        
        Thread t3 = new Thread(() -> {
            int min = Arrays.stream(a).min().getAsInt();
            System.out.println("Minimum: " + min);
        });
        
        t1.start();
        t2.start();
        t3.start();
    }
}