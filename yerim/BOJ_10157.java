//20260220
//백준 실버3 10157 자리배정

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(br.readLine());
		
		int[][] map = new int[m][n];
		
		//상우하좌
		int[] dr = {-1, 0, 1, 0}; //행(위아래)
		int[] dc = {0, 1, 0, -1}; //열(좌우)
		int r = m - 1;
		int c = 0;
		int dir = 0; //방향
		
		for (int num = 1; num <= m * n; num++) {
			map[r][c] = num;
			
			if (num == m * n)
				break;
			
			int nr = r + dr[dir];
			int nc = c + dc[dir];
			
			if (0 > nr || nr >= m || 0 > nc || nc >= n || map[nr][nc] != 0) {
				dir = (dir + 1) % 4;
				nr = r + dr[dir];
				nc = c + dc[dir]; 
			}
				
			r = nr;
			c = nc;
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (target > m * n) {
					bw.write("0");
					bw.flush();
					return;
				}
				
				if (map[i][j] == target) {
					bw.write((j + 1) + " " + (m - i));
					bw.flush();
					return;
				}
			}
		}
		
		bw.write("0");
	}
}
