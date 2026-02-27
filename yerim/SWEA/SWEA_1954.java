//20260207
//SWEA D2 1954 달팽이숫자

import java.io.*;
import java.util.*;
 
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        int t = Integer.parseInt(br.readLine());
 
        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][n];
 
            int r = 0; //현재 행 위치
            int c = 0; //현재 열 위치
            int dir = 0; //방향
            // 동, 남, 서, 북
            int[] dr = { 0, 1, 0, -1 }; // 행(위아래)
            int[] dc = { 1, 0, -1, 0 }; // 열(좌우)
 
            for (int num = 1; num <= n * n; num++) {
                arr[r][c] = num; //현재 칸에 숫자 넣기
                 
                int nr = r + dr[dir]; //다음 행 위치
                int nc = c + dc[dir]; //다음 열 위치
                 
                if (nr < 0 || nr >= n || nc < 0 || nc >= n || arr[nr][nc] != 0) { //범위 밖일 경우
                    dir = (dir + 1) % 4; //90도 회전
                    nr = r + dr[dir]; //다음 행 위치 갱신 -> 90도 회전
                    nc = c + dc[dir]; //다음 열 위치 갱신 -> 90도 회전
                }
                 
                r = nr; //현재 행 위치 갱신
                c = nc; //현재 열 위치 갱신
            }
             
            bw.write("#" + tc + "\n");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    bw.write(arr[i][j] + " ");
                }
                bw.newLine();
            }
        }
 
        bw.flush();
    }
}
