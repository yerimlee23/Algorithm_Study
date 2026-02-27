import java.util.*;

public class BOJ_2477_참외밭 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		//육각형
		int[][] ds = new int[2][6]; //0: 방향, 1: 길이
		for (int i = 0; i<6; i++) {
			ds[0][i] = sc.nextInt();
			ds[1][i] = sc.nextInt();
		}
		
		int maxHor = 0;
		int maxVer = 0;
		for(int i = 0; i<6; i++) {
			if (ds[0][i] == 1 || ds[0][i] == 2) maxHor = Math.max(maxHor, ds[1][i]);
			else if (ds[0][i] == 3 || ds[0][i] == 4) maxVer = Math.max(maxVer, ds[1][i]);
		}

		int nonSq = 0;
		for(int i = 0; i<6; i++) {
			if ((ds[0][i%6] == ds[0][(i+2)%6]) && (ds[0][(i+1)%6] == ds[0][(i-1+6)%6])) {
				nonSq = ds[1][i%6]*ds[1][(i+1)%6];
			}
		}
		System.out.println(((maxHor*maxVer)-nonSq)*K);
	}
}
