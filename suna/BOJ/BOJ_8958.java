import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int k = 0; k < N; k++) {
			String str = sc.next();
			int combo = 0;
			int score = 0;

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'O') {
					score += ++combo;
				} else {
					combo = 0;
				}
			}
			System.out.println(score);
		}

	}

}
