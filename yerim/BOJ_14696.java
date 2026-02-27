//20260223
//백준 브론즈1 14696 딱지놀이

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine()); // 게임 라운드 수

		for (int i = 0; i < n; i++) {
			String winner = "";

			StringTokenizer st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int[] person1 = new int[5];

			for (int j = 0; j < num1; j++) {
				int picture = Integer.parseInt(st.nextToken());
				person1[picture]++;
			}

			st = new StringTokenizer(br.readLine());
			int num2 = Integer.parseInt(st.nextToken());
			int[] person2 = new int[5];

			for (int j = 0; j < num2; j++) {
				int picture = Integer.parseInt(st.nextToken());
				person2[picture]++;
			}

			if (person1[4] > person2[4]) { // 별 개수 비교
				winner = "A";
			} else if (person1[4] < person2[4]) {
				winner = "B";
			} else if (person1[4] == person2[4]) { // 별 개수가 같을 때
				if (person1[3] > person2[3]) { // 동그라미 개수 비교
					winner = "A";
				} else if (person1[3] < person2[3]) {
					winner = "B";
				} else if (person1[3] == person2[3]) { // 동그라미 개수가 같을 때
					if (person1[2] > person2[2]) { // 네모 개수 비교
						winner = "A";
					} else if (person1[2] < person2[2]) {
						winner = "B";
					} else if (person1[2] == person2[2]) { // 네모 개수가 같을 때
						if (person1[1] > person2[1]) { // 세모 개수 비교
							winner = "A";
						} else if (person1[1] < person2[1]) {
							winner = "B";
						} else if (person1[1] == person2[1]) { // 세모 개수가 같을 때
							winner = "D";
						}
					}
				}
			}
			
			bw.write(winner +"\n");
		}
		
		bw.flush();
	}
}
