//20260213
//백준 브론즈2 8320 직사각형을 만드는 방법

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		for (int i = 1; i <= n; i++) {
			for (int j = i; j * i <= n; j++) {
				count++;
			}
		}
		
		bw.write(count + "\n");
		bw.flush();
	}
}
