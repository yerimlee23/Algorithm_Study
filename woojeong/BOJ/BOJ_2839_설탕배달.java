import java.util.Scanner;

public class BOJ_2839_설탕배달 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int tmp = N%10;
		int cnt = -1;
		
		if(tmp == 0 || tmp == 5) {
			cnt = N/5;
		}
		else if(tmp == 1 || tmp == 6) {
			if(N>=6 && (N-6)%5 == 0) cnt = (N-6)/5 + 2;
			else if(N>=21 && (N-21)%5 == 0) cnt = (N-21)/5 + 7;
		}
		else if(tmp == 2 || tmp == 7) {
			if(N>=12 && (N-12)%5 == 0) cnt = (N-12)/5 + 4;
			else if(N>=27 && (N-27)%5 == 0) cnt = (N-27)/5 + 9;
		}
		else if(tmp == 3 || tmp == 8) {
			if(N>=3 && (N-3)%5 == 0) cnt = (N-3)/5 + 1;
			else if(N>=18 && (N-18)%5 == 0) cnt = (N-18)/5 + 6;
		}
		else if(tmp == 4 || tmp == 9) {
			if(N>=9 && (N-9)%5 == 0) cnt = (N-9)/5 + 3;
			else if(N>=24 && (N-24)%5 == 0) cnt = (N-24)/5 + 8;
		}
		System.out.println(cnt);
	}	
}
