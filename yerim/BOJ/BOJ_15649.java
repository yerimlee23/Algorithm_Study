//20260226
//백준 실버3 15649 N과M(1)

import java.io.*;
import java.util.*;

public class Main {
	static int n;
	static int m;
	static int[] arr;
	static boolean[] check;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n + 1];
		check = new boolean[n + 1];
		
		backtracking(0);
		bw.write(sb + "");
		bw.flush();
	}
	
	public static void backtracking(int idx) {
		if (idx == m) {
			for (int i = 0; i < m; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i = 1; i <= n; i++) {
			if (check[i]) continue;
			
			check[i] = true;
			arr[idx] = i;
			backtracking(idx + 1);
			check[i] = false;
		}
	}
}
