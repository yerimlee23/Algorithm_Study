import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int map[][] = new int[1001][1001];
		
		// map 채우기
		for(int i = 1; i<=N; i++) {
			//////////////////////////////////////////
			int x = sc.nextInt();
			int y = sc.nextInt();
			int xlen = sc.nextInt();
			int ylen = sc.nextInt();
			for(int a = x; a<x+xlen; a++) {
				for(int b = y; b<y+ylen; b++) {
					map[a][b] = i;
				}
			}
				
			///////////////////////////////////////////
		}
		
		// map 안의 숫자 카운트
		for(int a = 1; a<=N; a++ ) {
			int cnt = 0;
			for(int i = 0; i<1001; i++) {
				for(int j = 0; j<1001; j++) {
					if(a == map[i][j])
						cnt++;
				}
			}
			System.out.println(cnt);
		}
		
		
		
	}
}
