import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int pa = fs.nextInt(), pb = fs.nextInt(), qa = fs.nextInt(), qb = fs.nextInt();
			int p = Math.max(pa, pb), q = Math.max(qa, qb);
			if (p == q) {
				System.out.println("TIE");
			} else if (p < q) {
				System.out.println("P");
			} else {
				System.out.println("Q");
			}
		}
		fs.close();
	}
}
