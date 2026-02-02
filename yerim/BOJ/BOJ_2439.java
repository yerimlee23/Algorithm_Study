//20260202
//백준 브론즈4 2439 별찍기2

import java.io.*;

public class BOJ_2439 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - 1 - i; j++) {
				bw.write(" ");
			}
			
			for (int j = 0; j <= i; j++) {
				bw.write("*");
			}
			
			bw.write("\n");
		}
		
		bw.flush();
	}

}
