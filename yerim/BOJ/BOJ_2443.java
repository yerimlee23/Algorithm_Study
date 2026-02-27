//20260202
//백준 브론즈3 2443 별찍기6

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                bw.write(" ");
            }

            for (int j = 1; j < 2 * (N - i); j++) {
                bw.write("*");
            }

            bw.write("\n");
        }

        bw.flush();
    }
}
