import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Solution_5521_상원생일파티 {
	static List<Integer>[] bf;
	static Queue<Integer> visit;
	static boolean[] checked;
	static int N;
	static int cnt;
	static int inv;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc<= T; tc++) {
			N = sc.nextInt();
			int M = sc.nextInt(); //간선 친한친구 관계 수
			
			bf = new ArrayList[N+1];
			checked = new boolean[N+1];
			visit = new LinkedList<>();
			
			for(int i = 1; i<N+1; i++) {
				bf[i] = new ArrayList<>();
			}
			
			for(int i = 0; i<M; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				bf[a].add(b);
				bf[b].add(a);
			}
			
			inv = 0;
			cnt = 0;
			
			bfs(1);
			System.out.println("#" + tc + " " + inv);
		}
		
		
	}
	
	static void bfs(int s) {
		checked[s] = true;
		visit.offer(s);
		
		
		while(!(visit.isEmpty()) && (cnt <= bf[1].size())) {
			int fre = visit.poll();
			cnt++;
			
			for(int bbf : bf[fre]) {
				if(!checked[bbf]) {
					checked[bbf] = true;
					inv++;
					visit.offer(bbf);
				}
				
			}
		}
	}
}
