//20260208
//SWEA D2 1961 숫자배열회전

import java.io.*;
import java.util.*;
 
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        int t = Integer.parseInt(br.readLine());
 
        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            int[][] map = new int[n][n];
             
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
         
            bw.write("#" + tc + "\n");
             
            for (int i = 0; i < n; i++) {
                //90도 회전
                for (int j = 0; j < n; j++) {
                    bw.write(map[n - j - 1][i] + "");
                }
                bw.write(" ");
                 
                //180도 회전
                for (int j = 0; j < n; j++) {
                    bw.write(map[n - i - 1][n - j - 1] + "");
                }
                bw.write(" ");
                 
                //270도 회전
                for (int j = 0; j < n; j++) {
                    bw.write(map[j][n - i - 1] + "");
                }
                 
                bw.newLine();
            }
        }
 
        bw.flush();
    }
}
