//20260218
//백준 실버3 10158 개미

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken()); // 격자 가로
		int c = Integer.parseInt(st.nextToken()); // 격자 세로

		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()); // 초기 위치
		int y = Integer.parseInt(st.nextToken()); // 초기 위치
		int time = Integer.parseInt(br.readLine()); // 움직이는 시간

		int targetX = (time + x) % (2 * r); 
		int targetY = (time + y) % (2 * c); 

		if (targetX > r) {
			targetX = 2 * r - targetX;
		}

		if (targetY > c) {
			targetY = 2 * c - targetY;
		}

		bw.write(targetX + " " + targetY);
		bw.flush();
	}
}
