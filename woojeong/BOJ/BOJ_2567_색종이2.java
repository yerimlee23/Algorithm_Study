import java.util.*;

public class BOJ_2567_색종이2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //색종이 개수
		int[][] whPa = new int[101][101];
		
		for(int t = 0; t<N; t++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int i = 0; i<10; i++) {
				for(int j = 0; j<10; j++) {
					whPa[x+i][y+j] = 1;
				}
			}
		}
		
		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};
		int len = 0;
		
		for(int i = 0; i<101; i++) {
			for(int j = 0; j<101; j++) {
				for(int k = 0; k< 4; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					
					if ( nx < 0 || ny < 0 || nx >= 101 || ny >= 101 ) {
						continue;
					}
					
					if (whPa[i][j] == 1) {
						if(whPa[nx][ny] == 0) {
							len++;
							continue;
						}				
					}
				}
				
			}
		}
		System.out.println(len);
	}
}
