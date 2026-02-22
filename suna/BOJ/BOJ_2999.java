import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		int N = str.length();
		int R = 0;
		
		for(int i = ((int) Math.sqrt(N)); i>=1 ; i--) {
			if(N%i ==0 ) {
				R = i;
				break;
			}
		}
		
		int C = N/R;
		
		char[][] map = new char[R][C];
		
		int k = 0;
		for(int j = 0 ; j<C; j++) {
			for(int i = 0; i<R; i++)
				map[i][j] = str.charAt(k++);
		}
		
		for(int i = 0; i<R; i++) {
			for(int j = 0; j<C; j++)
				System.out.print(map[i][j]);
		}
		
	}
		
}
