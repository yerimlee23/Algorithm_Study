//20260224
//백준 실버3 17413 단어뒤집기2

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == '<') { //여는 괄호일 때
				while (!stack.empty()) { //stack이 비어있지 않을 때까지
					sb.append(stack.pop()); //stack에 pop해서 sb에 추가
				}
				
				while (i < str.length() && str.charAt(i) != '>') { //닫는 괄호가 아닐 때까지
					sb.append(str.charAt(i++)); //sb에 ch 추가
				}
				sb.append('>'); //sb에 닫는 괄호 추가
			} else if (ch == ' ') { //공백일 때
				while (!stack.empty()) { //stack이 비어있지 않을 때까지
					sb.append(stack.pop()); //stack에 pop해서 sb에 추가
				}
				sb.append(" "); //한 단어가 끝날 때 공백 추가
			} else { //제약조건이 없을 때
				stack.push(ch); //stack에 ch 추가
			}
		}
		
		while (!stack.empty()) { //stack에 남아있는 단어 처리
			sb.append(stack.pop());
		}
	
		bw.write(sb.toString());
		bw.flush();
	}
}
