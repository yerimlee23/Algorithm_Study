//20260227
//백준 실버3 15654 N과M(5)

import java.io.*;
import java.util.*;

public class Main {
	static int n;
	static int m;
	static int[] arr;
	static int[] result;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n];
		result = new int[m];
		visited = new boolean[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		backtracking(0);
		bw.write(sb.toString());
		bw.flush();
	}
	
	public static void backtracking(int idx) {
		if (idx == m) {
			for (int i = 0; i < m; i++) {
				sb.append(result[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i = 0; i < n; i++) {
			if (visited[i]) 
				continue;
			
			visited[i] = true;
			result[idx] = arr[i];
			backtracking(idx + 1);
			visited[i] = false;
		}
	}
}
