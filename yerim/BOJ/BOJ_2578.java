//20260220
//백준 실버4 2578 빙고

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[][] paper = new int[5][5]; // 참가자 빙고판
		int[][] check = new int[5][5]; // 사회자 빙고판

		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				check[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int numCount = 0; // 사회자가 부르는 수 카운팅

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int target = check[i][j]; // target = 사회자 빙고판의 숫자
				numCount++;

				for (int k = 0; k < 5; k++) {
					for (int l = 0; l < 5; l++) {
						if (paper[k][l] == target) { // 참가자 빙고판의 숫자 = target(사회자 빙고판의 숫자)
							paper[k][l] = -1; // 참여자 빙고판의 숫자를 -1로 바꿈
						}
					}
				}

				if (countBingo(paper) >= 3) { // 빙고가 3줄 이상일 때
					bw.write(numCount + ""); // 카운팅된 사회자가 부르는 수 출력
					bw.flush();
					return; // 종료
				}
			}
		}
	}

	public static int countBingo(int[][] board) {
		int totalBingo = 0;

		// 가로 빙고
		for (int i = 0; i < 5; i++) {
			int rowBingo = 0;
			for (int j = 0; j < 5; j++) {
				if (board[i][j] == -1)
					rowBingo++;
			}

			if (rowBingo == 5)
				totalBingo++;
		}

		// 세로 빙고
		for (int i = 0; i < 5; i++) {
			int colBingo = 0;
			for (int j = 0; j < 5; j++) {
				if (board[j][i] == -1)
					colBingo++;
			}

			if (colBingo == 5)
				totalBingo++;
		}

		// 대각선 빙고 (좌상 -> 우하)
		int croBingo1 = 0;
		for (int i = 0; i < 5; i++) {
			if (board[i][i] == -1)
				croBingo1++;
		}

		if (croBingo1 == 5)
			totalBingo++;

		// 대각선 빙고 (좌하 -> 우상)
		int croBingo2 = 0;
		for (int i = 0; i < 5; i++) {
			if (board[i][4 - i] == -1)
				croBingo2++;
		}
		
		if (croBingo2 == 5)
			totalBingo++;

		return totalBingo;
	}
}
