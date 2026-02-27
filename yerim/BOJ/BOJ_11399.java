//20260221
//백준 실버4 11399 ATM

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] time = new int[n];
		int min = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			time[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(time);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				min += time[j];
			}
		}
		
		bw.write(min + "");
		bw.flush();
	}
}
