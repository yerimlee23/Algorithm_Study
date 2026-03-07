//20260307
//백준 실버2 1260 DFS와BFS

import java.io.*;
import java.util.*;

public class Main {
	static int n;
	static int m;
	static int v;
	static ArrayList<Integer>[] list;
	static Queue<Integer> queue = new LinkedList<>();
	static boolean[] visited;
	static StringBuilder dfsSB = new StringBuilder();
	static StringBuilder bfsSB = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); //정점
		m = Integer.parseInt(st.nextToken()); //간선
		v = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[n + 1];
		
		for (int i = 1; i <= n; i++) {
			list[i] = new ArrayList<>();
		}
		
		for (int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			list[p].add(c);
			list[c].add(p);
		}
		
		for (int i = 1; i <= n; i++) {
			Collections.sort(list[i]);
		}
		
		visited = new boolean[n + 1];
		dfs(v);
		
		visited = new boolean[n + 1];
		bfs(v);
		
		bw.write(dfsSB + "\n");
		bw.write(bfsSB + "");
		bw.flush();
	}
	
	public static void dfs(int node) {
		visited[node] = true;
		dfsSB.append(node).append(" ");
		
		for (int num : list[node]) {
			if (!visited[num]) {
				dfs(num);
			}
		}
	}
	
	public static void bfs(int start) {
		queue.add(start);
		visited[start] = true;
		
		while (!queue.isEmpty()) {
			int node = queue.poll();
			bfsSB.append(node).append(" ");
			
			for (int next : list[node]) {
				if (!visited[next]) {
					visited[next] = true;
					queue.add(next);
				}
			}
		}
	}
}
