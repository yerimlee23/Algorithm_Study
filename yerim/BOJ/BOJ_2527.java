//20260226
//백준 실버1 2527 직사각형

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int p1 = Integer.parseInt(st.nextToken());
			int q1 = Integer.parseInt(st.nextToken());

			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int p2 = Integer.parseInt(st.nextToken());
			int q2 = Integer.parseInt(st.nextToken());

			// 공통부분이 없을 때
			if (p1 < x2 || q1 < y2 || p2 < x1 || q2 < y1)
				bw.write("d\n");

			// 점이 겹칠 때
			else if ((p1 == x2 && q1 == y2) || (p1 == x2 && y1 == q2) || (x1 == p2 && q1 == y2) || (x1 == p2 && y1 == q2)) 
				bw.write("c\n");
	
			// 선분이 겹칠 때
			else if (p1 == x2 || x1 == p2 || q1 == y2 || y1 == q2) 
				bw.write("b\n");

			// 직사각형이 겹칠 때
			else
				bw.write("a\n");
		}

		bw.flush();
	}
}
