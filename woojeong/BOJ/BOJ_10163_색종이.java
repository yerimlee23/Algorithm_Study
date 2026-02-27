import java.util.*;

public class BOJ_10163_색종이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] co = new int[1001][1001];

		int N = sc.nextInt();
		for (int t = 1; t <= N; t++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int w = sc.nextInt();
			int h = sc.nextInt();

			for (int i = x; i < (x + w); i++) {
				for (int j = y; j < (y + h); j++) {
					co[i][j] = t;
				}
			}
		}

		for (int t = 1; t <= N; t++) {
			int cnt=0;
			for (int i = 0; i < 1001; i++) {
				for (int j = 0; j < 1001; j++) {
					if(co[i][j] == t) cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
