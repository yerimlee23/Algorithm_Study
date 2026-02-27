//20260218
//백준 브론즈2 2605 줄세우기

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		List<Integer> list = new ArrayList<>();
		
		int people = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < people; i++) {
			int num = Integer.parseInt(st.nextToken());
			list.add(list.size() - num, i + 1);
		}
		
		for (int person : list) {
			bw.write(person + " ");
		}
		
		bw.flush();
	}
}
