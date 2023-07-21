import java.util.*;
class countinrow {
    public static int[][] chunkArray(int[] arr, int size) {
        int numOfChunks = (int) Math.ceil((double) arr.length / size);
        int[][] chunkedArray = new int[numOfChunks][];
        int startIndex = 0;

        for (int i = 0; i < numOfChunks; i++) {
            int endIndex = Math.min(startIndex + size, arr.length);
            int chunkSize = endIndex - startIndex;
            int[] chunk = new int[chunkSize];

            for (int j = 0; j < chunkSize; j++) {
                chunk[j] = arr[startIndex + j];
            }

            chunkedArray[i] = chunk;
            startIndex += size;
        }

        return chunkedArray;
    }

    public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
        int n =s.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=s.nextInt();
		}
		int size =s.nextInt();
        int[][] chunkedArray = chunkArray(arr, size);
        printArray(chunkedArray);
    }

    public static void printArray(int[][] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (j < arr[i].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("]");
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}