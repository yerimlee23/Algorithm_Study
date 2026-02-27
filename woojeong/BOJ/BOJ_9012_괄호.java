import java.util.*;

public class BOJ_9012_괄호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 0; tc<T; tc++) {
			Stack<Character> gwalSt = new Stack<>();
			Stack<Character> gwalEnd = new Stack<>();
			
			String input = sc.next();
			for(int i = 0; i<input.length(); i++) {
				if (input.charAt(i) == '(') {
					gwalSt.push(input.charAt(i));
				} else {
					if(!gwalSt.isEmpty()) {
						gwalSt.pop();
					} else gwalEnd.push(input.charAt(i));
				}
			}
			
			if(gwalSt.size() == 0 && gwalEnd.size()==0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
