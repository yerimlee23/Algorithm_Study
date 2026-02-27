//20260214
//백준 브론즈1 3985 롤케이크

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int len = Integer.parseInt(br.readLine()); //롤케이크 길이
		int n = Integer.parseInt(br.readLine()); //사람 수
		
		int[] cake = new int[len + 1];
		int person = 1; //사람 번호
		int maxExpect = 0; //가장 많은 조각을 원하는 사람의 조각 수
		int maxRecive = 0; //실제로 가장 많은 조각을 받은 사람의 조각 수
		int result1 = 0; //가장 많은 조각을 원하는 사람 번호
		int result2 = 0; //실제로 가장 많은 조각을 받은 사람 번호
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			for (int j = start; j <= end; j++) {
				if (cake[j] == 0) {
					cake[j] = person;
				}
			}
			
			if (end - start + 1 > maxExpect) {
				result1 = person;
			}
			
			maxExpect = Math.max(maxExpect, end - start + 1);
			person++;
		}
		
		int[] people = new int[n + 1];
		
		for (int i = 0; i < len; i++) {
			for (int j = 1; j <= n; j++) {
				if (cake[i] == j) {
					people[j]++;
				}
			}
		}
		
		for (int i = 1; i < people.length; i++) {
			if (people[i] > maxRecive) {
				result2 = i;
			}
			
			maxRecive = Math.max(maxRecive, people[i]);
		}
		
		bw.write(result1 + "\n");
		bw.write(result2 + "\n");
		bw.flush();
	}
}
