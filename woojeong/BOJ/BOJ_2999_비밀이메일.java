import java.util.*;

public class BOJ_2999_비밀이메일 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String enMes = sc.next();
		
		int N = enMes.length();
		
		int R = 0, C = 0;
		
		for(int i = 1; i<=N; i++) {
			for(int j = 1; j<=i; j++) {
				if(j*i == N) {
					R = Math.max(R, j);
					C = N/R;
				}
			}
		}
		
		char[][] encryp = new char[R][C];
		
		int k = 0;
		for(int i = 0; i<C; i++) {
			for(int j=0; j<R; j++) {
				encryp[j][i] = enMes.charAt(k++);
			}
		}
		
		for(int i = 0; i<R; i++) {
			for(int j=0; j<C; j++) {
				System.out.print(encryp[i][j]);
			}
		}
	}
}
