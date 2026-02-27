//20260205
//백준 실버2 2477 참외밭

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine()); //참외 개수
		int[] len = new int[6]; //길이 배열
		int maxW = 0, maxH = 0; //가로, 세로 최댓값
		int maxWIdx = 0, maxHIdx = 0; //가로, 세로 최대값 인덱스

		for (int i = 0; i < 6; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int dir = Integer.parseInt(st.nextToken()); //방향
			len[i] = Integer.parseInt(st.nextToken()); //길이
			
			if (dir == 1 || dir == 2) { //동, 서
				if (len[i] > maxW) {
					maxW = len[i];
					maxWIdx = i;
				}
			} else if (dir == 3 || dir == 4) { //남, 북
				if (len[i] > maxH) {
					maxH = len[i];
					maxHIdx = i;
				}
			}
		}
		
		int totalArea = maxW * maxH;
		int smallH = Math.abs(len[(maxWIdx + 5) % 6] - len[(maxWIdx + 1) % 6]); //이전 칸, 다음 칸
		int smallW = Math.abs(len[(maxHIdx + 5) % 6] - len[(maxHIdx + 1) % 6]); //이전 칸, 다음 칸
		int smallArea = smallH * smallW;
		int result = (totalArea - smallArea) * num;

		bw.write(result + "");
		bw.flush();
	}
}
