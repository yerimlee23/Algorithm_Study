import java.util.*;

public class Main_4949_균형잡힌세상 {
	static Stack<Character> gwal;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			String line = sc.nextLine();
			String ans = "yes";
			gwal = new Stack<>();
			
			//if(!line.contains(".")) return;
			if(line.equals(".")) break;
			
			for(int i = 0; i<line.length(); i++) {
				char tmp = line.charAt(i);
				
				if (tmp =='(' || tmp == '[') {
					gwal.push(tmp);
				} 
				else if (tmp == ')') {
					if (!gwal.isEmpty() && gwal.peek() == '(') {
						gwal.pop();
					} else {
						ans = "no";
						break;
					}
				}
				else if ( tmp == ']') {
					if (!gwal.isEmpty() && gwal.peek() == '[') {
						gwal.pop();
					} else {
						ans = "no";
						break;
					}
				}
				
			} 
			 
			if(gwal.isEmpty() && ans == "yes") System.out.println(ans);
			else System.out.println("no"); //괄호 남아있는 경우 짝 안 맞는거니까 ans 말고 "no"
		}
	}
}
