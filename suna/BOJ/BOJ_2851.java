import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tmp1 = 0, tmp2 = 0; // tmp1<=tmp2 이 되게 하여 비교 -> 최종적으로는 tmp1가 100에 가까운 수가 되게
		
		for(int i = 0; i<10; i++) {
			tmp2+=sc.nextInt();
			if(Math.abs(tmp2-100) > Math.abs(tmp1-100)) {
				System.out.println(tmp1);
				return;
			}
			tmp1 = tmp2;
		}
		System.out.println(tmp2);
		
	}
}
