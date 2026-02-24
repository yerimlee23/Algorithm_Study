import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine()," <>",true);
		// 위와 같은 세팅을 주면 < // ab // // cd // > // ef // //  ge// < .... 이런식으로 tokenize됨
		
		
		while(st.hasMoreTokens()) {
			String a = st.nextToken();
			// a가 <이 들어오면 > 가 나올때까지 토큰을 print
			if(a.equals("<")) {
				while(!(a.equals(">"))) {
					System.out.print(a);
					a=st.nextToken();
				}
				System.out.print(a);
			}
			else {
				// < 이 아닌 토큰들은 토큰들 반전시킴
				for(int i = a.length()-1; i>=0; i--) {
					System.out.print(a.charAt(i));
				}
				
			}
		}
	}
}


//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//
//		Stack<Character> stack = new Stack<>();
//
//		boolean ok = false; // ok=true이면 <> 안의 내용들 바로 출력
//		for (int i = 0; i < str.length(); i++) {
//			char a = str.charAt(i);
//			// 만약 들어오는게 < -> 바로 출력,
//
//			if (a == '<') {
//				while (!stack.isEmpty()) {
//					System.out.print(stack.pop());
//				}
//
//				System.out.print(a);
//				ok = true;
//			} else if (a == '>') {
//				ok = false;
//				System.out.print(a);
//			} else if (a == ' ') {
//				while (!stack.isEmpty()) {
//					System.out.print(stack.pop());
//				}
//				System.out.print(' ');
//			} else {
//				// <>, 공백 이외의 것이 들어올 때
//				if (ok)
//					System.out.print(a);
//				else // <>이 아닐 때
//					stack.push(a);
//			}
//
//		}
//		while (!stack.isEmpty())
//			System.out.print(stack.pop());
//
//		//////////////////////////////////////////
//	}
//
//}



