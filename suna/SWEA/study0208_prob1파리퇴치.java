package study;

import java.util.Scanner;

public class study0208_prob1파리퇴치 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T= sc.nextInt();
	for(int t =1 ; t<=T; t++) {
		////////////////////////
		//입력
		int N = sc.nextInt();
		int M = sc.nextInt();
		int map[][] = new int[N+2][N+2];
		
		for(int i = 1; i<N+1;i++) {
			for(int j = 1; j<N+1;j++)
				map[i][j]= sc.nextInt();
		}
		
		//파리퇴치 최대값 - 파리채는 0~ (N+2-1)-(M-1)=N-M+2까지 탐색
		int res = 0;
		for(int i = 0; i<N-M+2; i++) {
			for(int j = 0; j<N-M+2;j++) {
				
				// 파리 수 계산
				int tmp = 0;
				for(int a = i; a< i+M; a++) {
					for (int b = j; b<j+M; b++)
						tmp += map[a][b];
				}
				// 현재의 최댓갑과 비교
				res = Math.max(res, tmp);
			}
		}
		System.out.printf("#%d %d", t, res);
		
		
		/////////////////
	}
}
}
