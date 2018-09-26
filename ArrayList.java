public class ArrayTest {

	public static void main(String[] args) {

//		int[] arr = {7, 1, 2, 3, 4, 6, 5, 8, 9, 10}; op 7
//		int[] arr = {7, 8, 2, 3, 4, 6, 5, 1, 9, 10};
//		int[] arr = {10, 4, 5, 8, 9, 1, 0, 2, 3};
		int[] arr = {10, 4, 5, 8, 9, 6, 0, 1, 2, 3};
		int subArr[][] = new int[arr.length][arr.length];

		int col = 0;
		int row = 0;
		
		for (int i = 0, j = i +1; j < arr.length && i < arr.length; i++, j++) 
		{
			if (arr[i] < arr[j] && (arr[j] - arr[i] == 1)) 
			{
				if((col > 0) && (subArr[row][col - 1] > arr[i]) && (subArr[row][col - 1] - arr[i] > 1))
				{
					row ++;
					col =0;
				}
				else if((col > 0) && (subArr[row][col - 1] < arr[i]) && ((arr[i] - subArr[row][col - 1])  > 1))
				{
					row ++;
					col =0;
				}
				
				if (col == 0) 
				{
					subArr[row][col] = arr[i];
					col++;
				}
				
				subArr[row][col] = arr[j];
				col++;
			}
		}
		
		int count = 0;
		
		// output 
		for (int i = 0; i <= row; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
				if (j > 0 && subArr[i][j] == 0) 
				{
					break;
				}
				else
				{
					count ++;
					System.out.print(subArr[i][j] + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println(count);
		
	}

}
