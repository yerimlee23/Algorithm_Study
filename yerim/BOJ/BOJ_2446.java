//20260203
//백준 브론즈3 2446 별찍기9

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                bw.write(" ");
            }

            for (int j = 1; j <= 2 * (N - i) + 1; j++) {
                bw.write("*");
            }

            bw.write("\n");
        }

        for (int i = 1; i <= N - 1; i++) {
            for (int j = i; j < N - 1; j++) {
                bw.write(" ");
            }

            for (int j = 1; j <= 2 * i + 1; j++) {
                bw.write("*");
            }

            bw.write("\n");
        }

        bw.flush();
    }
}
