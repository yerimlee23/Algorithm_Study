//20260208
//SWEA D3 1206 View

import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for (int i = 1; i <= 10; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            
            int max = 0; //최대 세대 수
            int result = 0; //조망권 확보된 세대 수 (출력값)
            
            //idx = j - 2부터 비교하므로 j = 2로 시작
            //idx = j + 2까지 비교하므로 j < N - 2까지
            for (int j = 2; j < N - 2; j++) { 
            	int leftMax = Math.max(arr[j - 2], arr[j - 1]); //왼쪽 2개 비교 (j 기준)
                int rightMax = Math.max(arr[j + 1] , arr[j + 2]); //오른쪽 2개 비교 (j 기준)
                
             	max = Math.max(leftMax, rightMax); //왼쪽, 오른쪽 최댓값 비교해서 max 도출
                
                if (arr[j] > max) { //기준점인 arr[j]가 max보다 크면 
                	result += arr[j] - max; //두 값의 차이만큼 result에 더함
                } 
            }
            
            bw.write("#" + i + " " + result + "\n");
        }
        
        bw.flush();
    }
}
