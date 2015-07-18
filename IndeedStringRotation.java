import java.util.Scanner;


public class IndeedStringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[] str = in.next().toCharArray();
		int m = in.nextInt();
		int l, r, k;
		for (int i=1; i<=m; i++) {
			l = in.nextInt();
			r = in.nextInt();
			k = in.nextInt();
			int j = 0;
			for (int z = 1; z<=k; z++) {
				char temp = str[r-1];
				for (j=r-1; j>=l; j--)
					str[j] = str[j-1];
				str[j] = temp;
			}
		}
		System.out.println(str);
	}
}
