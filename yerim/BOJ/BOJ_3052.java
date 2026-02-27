//20260215
//백준 브론즈2 3052 나머지

import java.io.*;
import java.util.*;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < 10; i++) {
			int num = Integer.parseInt(br.readLine());
			set.add(num % 42);
		}

		bw.write(set.size() + "");
		bw.flush();
	}
}
