package study;

import java.util.Scanner;

public class study0208_prob1View {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for(int t = 1; t<=T;t++) {
			//////////////////////////
			// 입력
			int size = sc.nextInt();// 건물 높이크기
			int[] build = new int[size];
			
			for(int i = 0; i<size; i++) {
				build[i]=sc.nextInt();
			}
			
			// 조망권 계산
			// (현재 건물 높이 - 인근 건물 높이)의 최솟값을 구했을 때
			// 음수면 현재 건물보다 큰 건물 존재 -> 조망권 0
			// 양수면 그만큼 조망권 확보
			
			int cnt = 0;
			for(int i = 2; i<size-2; i++) {
				int maxval = build[i]-build[i-2];
				// 높이차 최소값 구하기
				for (int k = -2; k<=2; k++) {
					if(k==0) continue;
					maxval = Math.min(maxval, build[i]-build[i+k]);
				}
				
				// 전체 조망권에 count - maxval이 음수면 0
				if(maxval < 0) maxval = 0;
				cnt +=maxval;
			}
			
			
			
			
			//출력
			System.out.printf("#%d %d\n", t, cnt);
			//////////////////////
		}
	}
}
