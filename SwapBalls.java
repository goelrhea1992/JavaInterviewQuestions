import java.util.Scanner;


public class SwapBalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int numOfBalls = 8;
		int[] balls = new int[numOfBalls];
		for (int i=0; i<numOfBalls; i++) {
			balls[i] = i+1;
		}
		int n = in.nextInt();
		long k = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int temp;
		for (int i = 0; i<n; i++) {
			a[i] = in.nextInt();
			b[i] = in.nextInt();
		}
		for (long z = 1; z<=k; z++) {
			for (int i = 0; i<n; i++) {
				temp = balls[a[i]-1];
				balls[a[i]-1] = balls[b[i]-1];
				balls[b[i]-1] = temp;
			}
		}
		
		for (int i=0; i<numOfBalls; i++) {
			System.out.print(balls[i] + " ");
		}
		System.out.println();
	}

}
