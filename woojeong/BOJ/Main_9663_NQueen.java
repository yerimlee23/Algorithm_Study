import java.util.*;

public class Main_9663_NQueen {
	static int[] col;
	static int N;
	static int ans;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N=sc.nextInt();
		col = new int[N];
		ans = 0;
		
		make(0);
		System.out.println(ans);
	}
	
	static void make(int row) {
		if (row == N) {
			ans++;
			return;
		}
		
		for(int c = 0; c<N; c++) {
			col[row] = c; //인덱스가 행이므로 행마다 1개의 값만 들어갈 수 있어 별도 중복 체크 필요 X
			
			if(isPossible(row)) {
				make(row+1);
			}
		}
	}
	
	static boolean isPossible(int row) {
		for(int i = 0; i<row; i++) {
			if (col[row] == col[i]) { //열 중복 체크 
				return false;
			}
			
			if (Math.abs(row-i) == Math.abs(col[row]-col[i])) { //대각선 중복 체크 
				return false;
			}
		}
		return true;
	}
}
