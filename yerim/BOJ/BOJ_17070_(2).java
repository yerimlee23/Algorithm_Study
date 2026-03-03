//20260301
//백준 골드5 17070 파이프옮기기1
//DP bottom-top 풀이방법

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[][] map = new int[n + 1][n + 1];
		
		for (int i = 1; i < n + 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j < n + 1; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		long[][][] dp = new long[n + 1][n + 1][3]; //r, c, dir
		dp[1][2][0] = 1; //(1, 1), (1, 2)
		
		for (int r = 1; r < n + 1; r++) {
			for (int c = 3; c < n + 1; c++) {
				if (map[r][c] == 1) {
					continue;
				}
				
				//가로 = 우 + 우하
				dp[r][c][0] = dp[r][c - 1][0] + dp[r][c - 1][2];
						
				//세로 = 하 + 우하
				dp[r][c][1] = dp[r - 1][c][1] + dp[r - 1][c][2];
						
				//대각선 = 우 + 하
				if (map[r - 1][c] == 0 && map[r][c - 1] == 0) {
					dp[r][c][2] = dp[r - 1][c - 1][0] + dp[r - 1][c - 1][1] + dp[r - 1][c - 1][2];
				}
			}
		}
		
		long count = dp[n][n][0] + dp[n][n][1] + dp[n][n][2]; //가로, 세로, 대각선 모두 더함
		
		bw.write(count + "");
		bw.flush();
	}
}
