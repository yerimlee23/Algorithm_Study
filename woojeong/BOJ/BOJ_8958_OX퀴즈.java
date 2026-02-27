import java.util.Scanner;

public class BOJ_8958_OX퀴즈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 0; tc<T; tc++) {
			String test = sc.next();
			
			int grade = 0;
			int sum = 0;
			
			for(int i = 0; i<test.length(); i++) {
				if (test.charAt(i) == 'O') {
					grade++;
				}else {
					grade = 0;
				}
				sum+=grade;
			}
			System.out.println(sum);
		}
	}
}
