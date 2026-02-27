//20260219
//백준 실버4 2839 설탕배달

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int count = 0;

		while (true) {
			if (n % 5 == 0) {
				count += n / 5;
				break;
			}
			
			if (n < 3) {
				count = -1;
				break;
			}
			
			n -= 3;
			count++;
		}
		
		bw.write(count + "");
		bw.flush();
	}
}
