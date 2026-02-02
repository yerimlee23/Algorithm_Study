//20260202
//백준 브론즈4 2440 별찍기3

import java.io.*;

public class BOJ_2440 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				bw.write("*");
			}
			
			bw.write("\n");
		}
		
		bw.flush();
	}
}
