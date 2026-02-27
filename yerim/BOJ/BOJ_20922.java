//20260222
//백준 실버1 20922 겹치는건싫어

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] count = new int[100001]; //양의 정수 배열
		int start = 0;
		int end = 0;
		int max = 0;
		
		while (end < n) {
			int len = 0;
			
			if (count[arr[end]] < k) {
				count[arr[end++]]++;
				len = end - start;
				max = Math.max(len, max);
			} else {
				count[arr[start]]--;
				start++;
			}
		}
		
		bw.write(max + "");
		bw.flush();
	}
}
