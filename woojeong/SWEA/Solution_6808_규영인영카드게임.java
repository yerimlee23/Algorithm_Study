import java.util.*;

public class Solution_6808_규영인영카드게임 {
	static List<Integer> in;
	static int[] kyu = new int[9];
	static boolean[] visited = new boolean[9];
	static int kSum;
	static int iSum;
	static int win;
	static int lose;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int T = sc.nextInt();
		
		
		for(int tc = 1; tc<=T; tc++) {
			in = new ArrayList<Integer>();
			
			for (int i = 1; i<=18; i++) {
				in.add(i);
			}
			
			for(int i = 0; i<9; i++) {
				kyu[i] = sc.nextInt();
				
				in.remove(in.indexOf(kyu[i]));
				
			}
			kSum = 0;
			iSum = 0;
			
			win = 0;
			lose = 0;
			
			perm(0);
			
			System.out.println("#" + tc + " " + win + " " + lose);
		}
	}
		
	
	static void perm (int st) {
		//가지치기
		if (kSum > 85) {
	        // 남은 라운드(9-st)의 모든 순열 개수만큼 win에 바로 더해줌
	        win += factorial(9 - st);
	        return;
	    }
	    if (iSum > 85) {
	        lose += factorial(9 - st);
	        return;
	    }
		
		if(st == 9) {
			if(kSum > iSum) {
				win++;
			} else if (kSum < iSum){
				lose++;
			} 
			return;
		}
		for(int i = 0; i<9; i++) {
			if (!visited[i]) {
				visited[i] = true;
				if(kyu[st] > in.get(i)) {
					kSum += (kyu[st] + in.get(i));
				} else { //어차피 같은 케이스는 없으니까 바로
					iSum += (kyu[st] + in.get(i));
				}
				perm(st+1);
				visited[i] = false;
				if(kyu[st] > in.get(i)) {
					kSum -= (kyu[st] + in.get(i));
				} else { //어차피 같은 케이스는 없으니까 바로
					iSum -= (kyu[st] + in.get(i));
				}
				
			}
		}
	}
	
	static int factorial(int n) {
	    int res = 1;
	    for (int i = 2; i <= n; i++) {
	    	res *= i;
	    }
	    return res;
	}
}
