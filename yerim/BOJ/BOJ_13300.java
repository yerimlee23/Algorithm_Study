//20260222
//백준 브론즈2 13300 방배정

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); //학생 수
		int maxN = Integer.parseInt(st.nextToken()); //한 방의 최대 학생 수
		int[] girlN = new int[7]; //여학생
		int[] boyN = new int[7]; //남학생
		int room = 0; //필요한 방의 수
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken());
			int grade = Integer.parseInt(st.nextToken());
			
			if (gender == 0) { //여학생일 때
				girlN[grade]++;
			} else if (gender == 1) { //남학생일 때
				boyN[grade]++;
			}
		}
		
		for (int i = 1; i < 7; i++) {
			if (girlN[i] > maxN) {
				room += girlN[i] / maxN;
				girlN[i] %= maxN;
			}
			
			if (boyN[i] > maxN) {
				room += boyN[i] / maxN;
				boyN[i] %= maxN;
			}
			
			if (girlN[i] > 0) {
				room++;
			}
			
			if (boyN[i] > 0) {
				room++;
			}
		}
		
		bw.write(room + "");
		bw.flush();
	}
}
