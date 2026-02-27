//20260202
//백준 브론즈2 2292 벌집

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int count = 1;
		int roomNum = 1;
		
		while (roomNum < n) {
			roomNum += count * 6;
			count++;
		}
		
		bw.write(count + "\n");
		bw.flush();
	}
}
