//20260228
//SWEA D2 1940 가랏!RC카!

import java.io.*;
import java.util.*;
 
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        int t = Integer.parseInt(br.readLine());
         
        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());    
            int velocity = 0;
            int distance = 0;
             
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int command = Integer.parseInt(st.nextToken());
                 
                if (command == 1) {
                    velocity += Integer.parseInt(st.nextToken());
                } else if (command == 2) {
                    int s = Integer.parseInt(st.nextToken());
                    velocity = Math.max(0, velocity - s);
                }
             
                distance += velocity;
            }
                 
            bw.write("#" + tc + " " + distance + "\n");
        }
 
        bw.flush();
    }
}
