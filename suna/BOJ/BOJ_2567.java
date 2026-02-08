//import java.util.Arrays;
//import java.util.Scanner;

//public class Main {
//
//	public static int[][] map = new int[102][102]; // 도화지
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int m = sc.nextInt(); // 전체 종이 수
//
//		// 도화지 완성 - 입력가능 구간은 1~100 x 1~100
//		for (int i = 0; i < m; i++) {
//			// xy 좌표 입력 받음
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			// 해당부분만큼 색칠 + 전체 검정 수 카운트
//			for (int x = a+1; x < a +1+ 10; x++) {
//				for (int y = b+1; y < b +1+ 10; y++) {
//						map[x][y] = 1;
//				}
//			}
//		}
//
//		// 0인 점을 기준으로 상하좌우에 1 개수를 카운트
//		int totcnt = 0;
//		for(int i = 0; i<102;i++) {
//			for(int j = 0; j<102; j++) {
//				// 0인 점일 일 때
//				if(map[i][j]==0)
//					totcnt += cnt0(i,j);				
//					
//			}
//		}
//		
//		System.out.println(totcnt);
//		
//	}
//	public static int cnt0(int i, int j) { // 0 값을 갖는 ij 점 주변에 1의 개수 카운트
//		int cnt = 0;
//		int[] dx = { 1, -1, 0, 0 };
//		int[] dy = { 0, 0, 1, -1 };
//
//		for (int k = 0; k < 4; k++) {
//			int nx = i + dx[k];
//			int ny = j + dy[k];
//
//			// nx,ny가 유효하지 않은 범위에 있으면 continue
//			if ((nx < 0 || ny < 0 || nx >= 102 || ny >= 102))
//				continue;
//			if(map[nx][ny]==1)
//				cnt++;
//		}
//		return cnt;
//	}
//
//}

// note : 둘레에 해당하는 1값만 세면 꼭짓점 쪽의 점이 한 번만 세어지므로 전체 둘레를 구할 수 없음
////////////////////////////////////////////////////////////////////////////
// sol2.

import java.util.Scanner;
public class Main {

	public static int[][] map = new int[102][102]; // 도화지

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(); // 전체 종이 수
		int cnt = 0;

		// 도화지 완성 - 입력가능 구간은 1~100 x 1~100
		for (int i = 0; i < m; i++) {
			// xy 좌표 입력 받음
			int a = sc.nextInt();
			int b = sc.nextInt();
			// 해당부분만큼 색칠 + 전체 검정 수 카운트
			for (int x = a + 1; x < a + 1 + 10; x++) {
				for (int y = b + 1; y < b + 1 + 10; y++) {
					map[x][y] = 1;
				}
			}
		}

		// 둘레 계산 : 이웃한 값이 다른 개수를 카운트
		for (int i = 0; i < 101; i++) {
			for (int j = 0; j < 101; j++) {
				if (map[i][j] != map[i + 1][j])
					cnt++;
				if (map[i][j] != map[i][j + 1])
					cnt++;
			}
		}

		System.out.println(cnt);

	}
}
