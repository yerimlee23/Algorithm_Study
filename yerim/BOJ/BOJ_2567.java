//20260206
//백준 실버3 2567 색종이2

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[][] map = new int[100][100];
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					if (0 <= x && x < 100 && 0 <= y && y < 100) {
						map[j][k]++;
					}
				}
			}
		}
		
		//동서남북
			int[][] d = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
			int sum = 0;
			
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					if (map[i][j] != 0) { //색종이 영역
						for (int k = 0; k < d.length; k++) {
							int a = i + d[k][0]; //행 변화(위아래)
							int b = j + d[k][1]; //열 변화(좌우)
							
							//색종이 둘레 구하기
							if (a < 0 || a >= 100 || b < 0 || b >= 100 || map[a][b] == 0) {
								sum++;
							}
						}
					}
				}
			}
			
			bw.write(sum + "");
			bw.flush();
	}
}
