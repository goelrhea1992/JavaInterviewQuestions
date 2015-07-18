
public class BinarySearch {

	public static void main(String args[]) {
		int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};
		System.out.println(getIndexOf(6,arr));
	}

	private static int getIndexOf(int i, int[] arr) {
		// TODO Auto-generated method stub
		
		int low = 0;
		int high = arr.length;
		int mid;
		
		while(low <= high) {
			mid = (low + high)/2;
			if(i == arr[mid]) 
				return mid;
			else if(i < arr[mid])
				high = mid;
			else
				low = mid;
		}
		return -1;
	}
}
