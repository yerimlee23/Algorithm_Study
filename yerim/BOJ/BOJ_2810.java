//20260210
//백준 브론즈1 2810 컵홀더

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine()); // 좌석 수
		String arr = br.readLine(); // 좌석 정보
		int max = n + 1; // 컵홀더 이용 가능한 사람의 최대 수
		int countL = 0; // 커플석 수

		for (int i = 0; i < arr.length(); i++) {
			if (arr.charAt(i) == 'L') {
				countL++;
			}
		}
		
		max -= countL / 2;
		
		if (max > n) {
			max = n;
		}
		
		bw.write(max + "");
		bw.flush();
	}
}
