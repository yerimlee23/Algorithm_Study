//20260307
//백준 실버5 25644 최대상승

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int before = Integer.MAX_VALUE;
		int diff = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int curr = Integer.parseInt(st.nextToken());
			
			before = Math.min(before, curr);
			diff = Math.max(diff, curr - before);
		}
		
		bw.write(diff + "");
		bw.flush();
	}
}
