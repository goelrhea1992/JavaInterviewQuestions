
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 10, 9, -4, 3, -8, 9, 0};
		int[] sortedArr = doMergeSort(arr);
		for (int i=0; i< sortedArr.length; i++) 
			System.out.print(sortedArr[i] + " ");
		
	}
	
	private static int[] doMergeSort(int[] arr) {
			if (arr.length > 1) {
				int mid = arr.length/2;
				int[] arrLeft = new int[mid];
				int[] arrRight = new int[arr.length - mid];
				System.arraycopy(arr, 0, arrLeft, 0, mid);
				System.arraycopy(arr, mid, arrRight, 0, arr.length - mid);
				arrLeft = doMergeSort(arrLeft);
				arrRight = doMergeSort(arrRight);
				return merge(arrLeft, arrRight);
			}
			return arr;
	}
	
	private static int[] merge(int[] arrLeft, int[] arrRight) {
		int k = 0, ptr1 = 0, ptr2 = 0;
		int[] merged = new int[arrLeft.length + arrRight.length];
		while (ptr1 < arrLeft.length && ptr2 < arrRight.length) {
			if (arrLeft[ptr1] <= arrRight[ptr2]) {
				merged[k] = arrLeft[ptr1];
				ptr1++;
			}	
			else {
				merged[k] = arrRight[ptr2];
				ptr2++;
			}
			k++;
		}
		
		while (ptr1 < arrLeft.length) {
			merged[k] = arrLeft[ptr1];
			k++;
			ptr1++;
		}
		
		while (ptr2 < arrRight.length) {
			merged[k] = arrRight[ptr2];
			k++;
			ptr2++;
		}
		
		return merged;
	}
}
