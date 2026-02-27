//20260225
//백준 실버4 1244 스위치켜고끄기

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()); //스위치 개수
		int[] arr = new int[n + 1]; //스위치 상태
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int people = Integer.parseInt(br.readLine()); //학생 수
		
		
		for (int i = 0; i < people; i++) {
			st = new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken()); //성별
			int num = Integer.parseInt(st.nextToken()); //학생별 받은 수
		
			if (gender == 1) { //남학생
				for (int j = num; j < arr.length; j += num) {
					if (arr[j] == 0) 
						arr[j] = 1;
					else
						arr[j] = 0;
				}
			} else if (gender == 2) { //여학생
				int target = num;
				int left = target - 1;
				int right = target + 1;
				
				while (0 < left && left < target && target < right && right < arr.length && arr[left] == arr[right]) {
					left--;
					right++;
				}
				
				//while문에서 변한 left, right 복구
				left++;
				right--;
				
				for (int j = left; j <= right; j++) {
					if (arr[j] == 0) 
						arr[j] = 1;
					else
						arr[j] = 0;
				}
			}
		}
		
		for (int i = 1; i < arr.length; i++) {
			bw.write(arr[i] + " ");	
			if (i % 20 == 0) 
				bw.newLine();
		}
		
		bw.flush();
	}
}
