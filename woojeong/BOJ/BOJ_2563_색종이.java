import java.util.Scanner;

public class BOJ_2563_색종이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] square = new int[100][100];
		int num = sc.nextInt();
		
		for(int t = 0; t < num ; t++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int i = x; i<x+10; i++) {
				for(int j = y; j<y+10;j++) {
					square[i][j] = 1;
				}
			}
			
		}
			
		int sum = 0;
		for(int i = 0; i <100 ; i++) {
			for(int j = 0; j<100 ; j++) {
				sum += square[i][j];
			}
		}
		sc.close();
		System.out.println(sum);
	}
}
