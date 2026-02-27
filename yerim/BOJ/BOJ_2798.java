//20260209
//백준 2798 브론즈2 블랙잭

import java.io.*;
import java.util.*;

public class Main {
	static int[] cards; //카드 배열
	static int sum = 0; //카드 3장의 합
	static int max = 0; //카드 3장의 최대합
	static int n; //카드 개수
	static int m; //목표 숫자
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); 
		m = Integer.parseInt(st.nextToken()); 
		
		cards = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0, 0, 0); //0번 인덱스부터 시작, 뽑은 카드 개수, 카드 합
		
		bw.write(max +"");
		bw.flush();
	}
	
	public static void dfs(int idx, int count, int sum) { //인덱스 번호, 뽑은 카드 개수, 카드 합
		if (count == 3) { //카드를 3장 뽑았을 때
			if (sum <= m) { //뽑은 카드의 합이 목표 숫자 이하일 때
				max = Math.max(max, sum);
			}
			return;
		}
		
		if (sum > m) { //뽑은 카드의 합이 목표 숫자 초과일 때
			return;
		}
		
		for (int i = idx; i < n; i++) {
			dfs(i + 1, count + 1, sum + cards[i]);
		}
	}
}
