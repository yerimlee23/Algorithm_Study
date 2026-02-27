//20260211
//백준 브론즈1 2851 슈퍼마리오

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[10];
		int sum = 0;
		
		for (int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		for (int i = arr.length - 1; i >= 0; i--) {
			if (sum > 100) {
				sum -= arr[i];
				
				if (sum <= 100) {
					if (100 - sum >= sum + arr[i] - 100) {
						sum += arr[i];
						break;
					}
				}
			}
		}
		
		
		bw.write(sum + "");
		bw.flush();
	}
}
