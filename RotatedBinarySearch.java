
public class RotatedBinarySearch {

	public static void main(String[] args) {
		//int[] a = { 9, 10, 11, 1, 2, 3, 4, 5, 6, 7, 8};
		int[] a = {20, 20, 3, 4};
		int left = 0, right = a.length - 1;

		boolean found = false;
		int x = 3;
		int mid = 0;
		
		while(left <= right) {
			mid = (left + right)/2;
			System.out.println(left + " " + right);
			System.out.println(mid + "\n");

			if (x == a[mid]) {
				System.out.println(mid);
				found = true;
				break;
			}
			if (a[left] <= a[mid]) {
				//left half is ordered normally
				if (x >= a[left] && x <= a[mid]) {
					right = mid - 1;
				}
				else {
					left = mid + 1;
				}
			}
			else {
				//right side is ordered normally
				if (x <= a[right] && x > a[mid]) {
					left = mid + 1;
				}
				else {
					right = mid - 1;
				}
			}
		}
	    if(!found) {
	    	System.out.println("Not found");
	    }
	}
}
	              

	                 

	                        

	 

