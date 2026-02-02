//20260202
//백준 브론즈5 2438 별찍기1

import java.io.*;

public class BOJ_2438 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; j++) {
				bw.write("*");
			}
			
			bw.write("\n");
		}
		
		bw.flush();
	}
}
