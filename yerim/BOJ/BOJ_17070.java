//20260301
//백준 골드5 17070 파이프옮기기1
//DFS 풀이방법

import java.io.*;
import java.util.*;

public class Main {
	static int n;
	static int[][] map;
	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		map = new int[n + 1][n + 1];
		
		for (int i = 1; i < n + 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j < n + 1; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(1, 2, 0); //r시작, c끝, dir방향
		
		bw.write(count + "");
		bw.flush();
	}
	
	public static void dfs(int r, int c, int dir) {
		if (r == n && c == n) {
			count++;
			return;
		}
		
		switch(dir) {
		case 0: //가로
			if (c + 1 <= n && map[r][c + 1] == 0) {
				dfs(r, c + 1, 0); //우, 우하
			}
			break;
		case 1: //세로
			if (r + 1 <= n && map[r + 1][c] == 0) {
				dfs(r + 1, c, 1); //하, 우하
			}
			break;
		case 2: //대각선
			if (c + 1 <= n && map[r][c + 1] == 0) {
				dfs(r, c + 1, 0); //우
			}
			
			if (r + 1 <= n && map[r + 1][c] == 0) {
				dfs(r + 1, c, 1); //하
			}
			break;
		}
		
		if (r + 1 <= n && c + 1 <= n && map[r + 1][c] == 0 && map[r][c + 1] == 0 && map[r + 1][c + 1] == 0) {
			dfs(r + 1, c + 1, 2); //우하
		}
	}
}
