//20260304
//백준 실버3 14501 퇴사

import java.io.*;
import java.util.*;

public class Main {
	static int n;
	static int[] date;
	static int[] price;
	static int maxPrice;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		date = new int[n];
		price = new int[n];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			date[i] = Integer.parseInt(st.nextToken());
			price[i] = Integer.parseInt(st.nextToken());
		}
		
		visited = new boolean[n];
		
		backtracking(0, 0);
		
		bw.write(maxPrice + "");
		bw.flush();
	}
	
	public static void backtracking(int idx, int sumPrice) {
		if (idx >= n) { //현재 인덱스  >= n (끝까지 탐색한 경우)
			maxPrice = Math.max(sumPrice, maxPrice);
			return;
		}
		
		//날짜 포함
		if (idx + date[idx] <= n) { //현재 인덱스 + 현재 date <= n
			backtracking(idx + date[idx], sumPrice + price[idx]); //현재 date의 price 더하기
		}
		
		//날짜 미포함
		backtracking(idx + 1, sumPrice); //다음 인덱스 확인
	}
}
