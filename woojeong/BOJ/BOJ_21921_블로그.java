//import java.util.*;
//
//public class BOJ_21921_블로그 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//		int X = sc.nextInt();
//		
//		int[] visit = new int[N+1];
//		for(int i = 1; i<N+1; i++) {
//			visit[i] = sc.nextInt();
//		}
//		
//		int cnt = 0;
//		int st = 0;
//		int xVis = 0;
//		int max = 0;
//		int maxVis = 1;
//		
//		while (st < N-X+1) {
//			cnt++;
//			if(cnt>X) {
//				st-=X;
//				cnt = 0;
//				if(xVis > max) {
//					max = xVis;
//					maxVis = 1;
//				} else if(xVis == max) {
//					maxVis++;
//				} else {
//					continue;
//				}
//				xVis = 0;
//				continue;
//			}
//			xVis += visit[st++];
//			if(st == N) break;
//			
//		}
//		
//		if(max != 0) {
//			System.out.println(xVis);
//			System.out.println(maxVis);
//		}
//		else {
//			System.out.println("SAD");
//		}
//	}
//}

import java.util.*;

public class BOJ_21921_블로그 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();

		int[] visit = new int[N];
		for (int i = 0; i < N; i++) {
			visit[i] = sc.nextInt();
		}

//		int max = 0, xVis = 0, st=0, cnt = 1; //max 최대방문자수, xVis x일동안 방문자수, st = 방문자수 세는 시작일, cnt 최대 방문자 수 
//		for(int i = st; i<N; i++) {
//			xVis += visit[i];
////			System.out.print(i);
//			if(i == (st+X-1)) { //st~X번 합
//				st++;
//				if(xVis > max) {
//					max = xVis;
//					cnt = 1;
//				} else if(xVis == max) {
//					cnt++;
//				}
//				xVis = 0;
//			}
//		}

		int cnt = 0; // 누적합 누적 개수
		int vis = 0; // 방문자 수
		int max = 0; // 최대방문자 수
		int rep = 1; // 최대방문자 수 몇 번 나오는 지

		for (int i = 0; i < visit.length; i++) {
			vis += visit[i];
			cnt++;

			if (cnt == X) { // 처음 0~X-1까지만 해당하는 조건문
				max = vis;
			} else if (cnt > X) { // X=3인데 cnt 4가 되면
				vis -= visit[i - X]; // 처음값 빼주고 max 비교 해줘야 함!!!
				cnt--;
				if (vis > max) {
					max = vis;
					rep = 1;
				} else if (vis == max) {
					rep++;
				}
			}
		}

		if (max != 0) {
			System.out.println(max);
			System.out.println(rep);
		} else {
			System.out.println("SAD");
		}
	}
}
