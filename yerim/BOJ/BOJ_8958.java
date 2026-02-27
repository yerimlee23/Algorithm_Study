//20260217
//백준 브론즈2 8958 OX퀴즈

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int tc = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < tc; i++) {
			String arr = br.readLine();
			int score = 0;
			int count = 0; // 누적합

			for (int j = 0; j < arr.length(); j++) {
				if (arr.charAt(j) == 'O') {
					count++;
				} else {
					count = 0; //누적합 초기화
				}
				
				score += count;
			}
			
			bw.write(score + "\n");
		}
		
		bw.flush();
	}
}
