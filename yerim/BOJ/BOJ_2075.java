//20260222
//백준 실버3 2075 N번째큰수

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //내림차순 정렬
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				pq.add(Integer.parseInt(st.nextToken())); //입력 받은 숫자를 pq에 추가
			}
		}
		
		for (int i = 0; i < n - 1; i++) { //마지막 원소(n번째 큰 수)전까지 pq에서 제거
			pq.poll();
		}
		
		bw.write(pq.poll() + ""); //마지막 원소(n번째 큰 수)pq에서 읽고 제거
		bw.flush();
	}
}
