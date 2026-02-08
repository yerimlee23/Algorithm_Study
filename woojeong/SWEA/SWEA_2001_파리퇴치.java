import java.util.Scanner;

class SWEA_2001_파리퇴치{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			int[][] flies = new int[N][N];//파리
			int[][] flap = new int[N - M + 1][N - M + 1]; //파리채

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					flies[i][j] = sc.nextInt();
				}
			}
			
            int max = 0;
			for (int i = 0; i < N - M + 1; i++) { //탐색 시작위치(크기는 flap배열) 
				for (int j = 0; j < N - M + 1; j++) { 
					//현재 위치(i, j)에서 우측, 하측 +M까지 탐색하여 합
					for (int r = i; r < i + M; r++) {
						for (int c = j; c < j + M; c++) {
							flap[i][j] += flies[r][c];
						}
					}
                    max = Math.max(max, flap[i][j]); //잡을 수 있는 최대파리값 비교
				}
			}
			System.out.println("#" + tc + " " + max);
		}
	}
}