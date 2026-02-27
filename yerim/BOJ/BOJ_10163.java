//20260220
//백준 브론즈1 10163 색종이

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[][] map = new int[1001][1001];
		int num = 1;
		int count = 0;
		
		for (int i = 0 ; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			
			for (int j = x; j < x + p; j++) {
				for (int k = y; k < y + q; k++) {
					map[j][k] = num;
				}
			}
			
			num++;
		}
		
		for (int i = 1; i <= n; i++) {
			count = 0;
			for (int j = 0; j < map.length; j++) {
				for (int k = 0; k < map.length; k++) {
					if (map[j][k] == i) {
						count++;
					}
				}
			}
			
			bw.write(count + "\n");
		}
		
		bw.flush();
	}
}
