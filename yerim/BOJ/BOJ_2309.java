//20260208
//백준 브론즈1 2309 일곱난쟁이

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] height = new int[9];
		int sum = 0;
		
		for (int i = 0; i < height.length; i++) {
			height[i] = Integer.parseInt(br.readLine());
			sum += height[i];
		}
		
		for (int i = 0; i < height.length; i++) {
			for (int j = i + 1; j < height.length; j++) {
				if (sum - height[i] - height[j] == 100) {
					height[i] = 0;
					height[j] = 0;
					
					Arrays.sort(height);

					for (int k = 2; k < height.length; k++) {
						bw.write(height[k] + "\n");
					}
					
					bw.flush();
					return;
				}
			}
		}
	}
}
