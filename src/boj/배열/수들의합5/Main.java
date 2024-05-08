package boj.배열.수들의합5;

import java.io.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int start = 1, end = 1, sum = 0, count = 0;

        while (true) {
            if (sum >= N)
                sum -= start++;
            else if (end > N)
                break;
            else
                sum += end++;
            if (sum == N)
                count++;
        }

        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
