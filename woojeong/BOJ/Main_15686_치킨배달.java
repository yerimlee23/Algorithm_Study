import java.util.*;

public class Main_15686_치킨배달 {
	static int M;
	static List<int[]> home;
	static List<int[]> chic;
	static boolean[] visited;
	static int ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int N = sc.nextInt();
		M = sc.nextInt(); // 폐업시키지 않을 치킨집 수

		int[][] map = new int[N][N];

		chic = new ArrayList<>();
		home = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();

				if (map[i][j] == 1) {
					home.add(new int[] { i, j });
				}
				if (map[i][j] == 2) {
					chic.add(new int[] { i, j });
				}
			}
		}

		visited = new boolean[chic.size()];

		ans = Integer.MAX_VALUE;

		minChic(0, 0);
		System.out.println(ans);
	}


	static void minChic(int idx, int cnt) {
		// 종료조건
		if (cnt == M) {

			calDis();
			return;
		}

		for (int i = idx; i<chic.size(); i++) { //조합은 이전 거는 안 본다(중복 방지)
			visited[i] = true;
			minChic(i+1, cnt+1);
			visited[i] = false;
		}
	}
	
	static void calDis() {
		int citySum = 0;
		
		for(int[] h : home) {
			int homeDis = Integer.MAX_VALUE;
			
			for(int j = 0; j < chic.size(); j++) {
				if(visited[j]) { //조합에 해당하는 치킨집만 본다.
					int[] c = chic.get(j);
					int dis = Math.abs(h[0] - c[0]) + Math.abs(h[1]-c[1]);
					homeDis = Math.min(homeDis, dis);	
				}
			}
			citySum += homeDis;
			
			// [가지치기] 현재까지 합 기존 최솟값(ans)과 같거나 큼
	        if (citySum >= ans) return;
		}
		
		ans = Math.min(ans, citySum);
	}
}
