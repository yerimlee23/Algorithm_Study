import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<4; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int a1 = sc.nextInt();
			int b1 = sc.nextInt();
			int a2 = sc.nextInt();
			int b2 = sc.nextInt();
			
			// 상태정의 1: 겹치는 부분 없음. 2: 한 점에서 겹침, 3: 걸쳐있거나 포함
			int xstat = 3; int ystat = 3;
			if(a2<x1 || x2<a1) xstat = 1;
			if(b2<y1 || y2<b1) ystat = 1;
			
			if(a2 == x1 || x2 == a1) xstat = 2;
			if(b2 == y1 || y2 == b1) ystat = 2;

			// 결과
			if(xstat == 1 || ystat ==1) {
				System.out.println("d");
			}
			else if (xstat ==2 && ystat ==2){
				System.out.println("c");
			} 
			else if(xstat == 3 && ystat == 3) {
				System.out.println("a");
			}else {
				System.out.println("b");
			}
			
		}
	}
}
