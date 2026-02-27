//20260213
//백준 브론즈1 2999 비밀이메일

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();
		
		int n = input.length(); //암호 글자수
		int r = 0;
		int c = 0;
		
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) { //i는 n의 약수
				r = i;
				c = n / i;
			}
		}
	
		char[][] arr = new char[r][c];
		int idx = 0;
		
		//열 기준
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				arr[j][i] = input.charAt(idx);
				idx++;
			}
		}
		
		//행 기준
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sb.append(arr[i][j]);
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}
