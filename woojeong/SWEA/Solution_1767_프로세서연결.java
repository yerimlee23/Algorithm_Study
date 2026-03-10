import java.util.*;

public class Solution_1767_프로세서연결 {
    static int N, maxCore, minWire;
    static int[][] map;
    static List<int[]> cores; // 내부에 있는 코어 위치 저장
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            N = sc.nextInt();
            map = new int[N][N];
            cores = new ArrayList<>();
            
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    map[i][j] = sc.nextInt();
                    // 가장자리 이미 전원 연결 -> 제외
                    if (map[i][j] == 1 && i > 0 && i < N - 1 && j > 0 && j < N - 1) {
                        cores.add(new int[]{i, j});
                    }
                }
            }
            
            maxCore = 0;
            minWire = Integer.MAX_VALUE;
            
            dfs(0, 0, 0); // 인덱스, 연결된 코어 수, 전선 길이 합
            System.out.println("#" + tc + " " + minWire);
        }
    }

    static void dfs(int idx, int coreCnt, int wireSum) {
    	if (coreCnt + (cores.size() - idx) < maxCore) {
    	    return;
    	}
    	
        // 모든 코어를 다 확인했을 때
        if (idx == cores.size()) {
            if (coreCnt > maxCore) { // 코어 개수가 더 많으면 갱신
                maxCore = coreCnt;
                minWire = wireSum;
            } else if (coreCnt == maxCore) { // 코어 개수가 동일 길이 최소
                minWire = Math.min(minWire, wireSum);
            }
            return;
        }
        
        //현재 코어 위치 
        int r = cores.get(idx)[0];
        int c = cores.get(idx)[1];

        // 상하좌우 탐색
        for (int d = 0; d < 4; d++) {
        	// 전선을 깔 수 있는지 확인 -> 전선길이 ++
            int cnt = 0;
            int nr = r, nc = c;
            boolean canGo = true;
            
            while (true) {
            	nr += dr[d];
            	nc += dc[d];
            	if (nr < 0 || nr >= N || nc < 0 || nc >= N) break; // 벽에 도달 -> 가도 Ok
            	if (map[nr][nc] != 0) { // 벽 도달 전 코어나 전선을 만나면 실패
            		canGo = false;
            		break; 
            	}
            	else cnt++; //벽이나, 코어, 전선 만나기 전까지 전선 수 ++
            }
            
            if (canGo) {
                wire(r, c, d, 2); // 전선(2) 표시
                dfs(idx + 1, coreCnt + 1, wireSum + cnt);
                wire(r, c, d, 0); // 전선 복구
            }
        }
        
        // 코어를 선택하지 않고 다음 코어로 넘어가는 경우
        dfs(idx + 1, coreCnt, wireSum);
    }

    // 특정 방향으로 전선을 채우거나 지우는 메서드
    static void wire(int r, int c, int d, int val) {
        int nr = r + dr[d];
        int nc = c + dc[d];
        while (nr >= 0 && nr < N && nc >= 0 && nc < N) {
            map[nr][nc] = val;
            nr += dr[d];
            nc += dc[d];
        }
    }
}
