//20260304
//SWEA D5 1247 최적경로

import java.io.*;
import java.util.*;

public class Main {
	static int n;
	static int companyX;
	static int companyY;
	static int homeX;
	static int homeY;
	static int[] customerX;
	static int[] customerY;
	static boolean[] visited;
	static int minRoute;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			n = Integer.parseInt(br.readLine());

			companyX = 0;
			companyY = 0;
			homeX = 0;
			homeY = 0;
			customerX = new int[n];
			customerY = new int[n];
			visited = new boolean[n];
			minRoute = Integer.MAX_VALUE;

			StringTokenizer st = new StringTokenizer(br.readLine());
			companyX = Integer.parseInt(st.nextToken());
			companyY = Integer.parseInt(st.nextToken());
			homeX = Integer.parseInt(st.nextToken());
			homeY = Integer.parseInt(st.nextToken());

			for (int i = 0; i < n; i++) {
				customerX[i] = Integer.parseInt(st.nextToken());
				customerY[i] = Integer.parseInt(st.nextToken());
			}
			
			dfs(0, companyX, companyY, 0);
		
			bw.write("#" + tc + " " + minRoute + "\n");
		}

		bw.flush();
	}
	
	public static void dfs(int idx, int curX, int curY, int sumRoute) {
		if (sumRoute >= minRoute) {
			return;
		}
		
		if (idx == n) { //모든 customer 방문 완료
			sumRoute += Math.abs(curX - homeX) + Math.abs(curY - homeY);
			minRoute = Math.min(sumRoute, minRoute);
			return;
		}
		
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				int curDis = Math.abs(customerX[i] - curX) + Math.abs(customerY[i] - curY);
				dfs(idx + 1, customerX[i], customerY[i], sumRoute + curDis);
				visited[i] = false;
			}
		}
	}
}
