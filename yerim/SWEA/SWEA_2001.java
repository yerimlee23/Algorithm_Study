//20260208
//SWEA D2 2001 파리퇴치

import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        
        for (int tc = 1; tc <= 10; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
        	int N = Integer.parseInt(st.nextToken()); //배열의 범위
            int M = Integer.parseInt(st.nextToken()); //파리채 크기
            int[][] map = new int[N][N];
            
         	for (int i = 0; i < N; i++) {
                st =  new StringTokenizer(br.readLine());
            	for (int j = 0; j < N; j++) {
                	map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
         	
         	int max = 0; //죽은 파리의 수 최대값 (출력값)
         	int sum = 0; //죽은 파리의 수 누적합
         	         	
            //파리채의 좌상단 시작점
         	for (int i = 0; i <= N  - M; i++) { //행 시작점
         		for (int j = 0; j <= N - M; j++) { //열 시작점
         			sum = 0;
         			
                    //파리채 영역 내부의 죽은 파리의 수 합산
         			for (int k = 0; k < M; k++) { //파리채 행
         				for (int l = 0; l < M; l++) { //파리채 열
         					sum += map[i + k][j + l]; //좌상단 시작점 + 파리채 범위
         				}
         			}
         			
         			max = Math.max(max, sum);
         		}
         	}
            
            bw.write("#" + tc + " " + max + "\n");
        }
        
    	bw.flush();
    }
}
