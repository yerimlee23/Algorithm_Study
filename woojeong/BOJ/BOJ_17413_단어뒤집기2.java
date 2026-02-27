import java.util.*;

public class BOJ_17413_단어뒤집기2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();

		StringBuilder str = new StringBuilder();
		Stack<Character> mir = new Stack<>();
		int i = 0;

		while (i < in.length()) {
			if (in.charAt(i) == '<') { // <면 일단 단어 sb에 append 후 그대로 <이후부터 >까지 append
				while (!mir.isEmpty()) str.append(mir.pop());

				while (i < in.length() && in.charAt(i) != '>') str.append(in.charAt(i++));
				str.append(in.charAt(i++)); // '>'
			}
			// 공백 : 단어 끝 -> sb에 append 후 공백도 append
			else if (in.charAt(i) == ' ') {
				while (!mir.isEmpty()) str.append(mir.pop());
				str.append(in.charAt(i++));
			}
			// 일반 문자
			else mir.push(in.charAt(i++));
		}
		while (!mir.isEmpty()) str.append(mir.pop());

		System.out.println(str);
	}
}
