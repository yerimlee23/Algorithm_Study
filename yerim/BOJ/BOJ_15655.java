//20260227
//백준 실버3 15655 N과M(6)

import java.io.*;
import java.util.*;

public class Main {
	static int n;
	static int m;
	static int[] arr;
	static int[] result;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n];
		result = new int[m];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		backtracking(0, 0);
		bw.write(sb.toString());
		bw.flush();
	}
	
	public static void backtracking(int idx, int start) {
		if (idx == m) {
			for (int i = 0; i < m; i++) {
				sb.append(result[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i = start; i < n; i++) {
			result[idx] = arr[i];
			backtracking(idx + 1, i + 1);
		}
	}
}
