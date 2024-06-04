package boj.배열.나머지합;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫째 줄에 N과 M이 주어진다. (1 ≤ N ≤ 106, 2 ≤ M ≤ 103)
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 둘째 줄에 N개의 수 A1, A2, ..., AN이 주어진다. (0 ≤ Ai ≤ 109)
        long[] prefixSum = new long[N + 1];
        long[] remainderCount = new long[M];
        remainderCount[0] = 1; // prefixSum[0]이 M으로 나누어떨어지는 경우를 포함하기 위해

        st = new StringTokenizer(br.readLine(), " ");
        long count = 0;
        for (int i = 1; i <= N; i++) {
            prefixSum[i] = prefixSum[i - 1] + Long.parseLong(st.nextToken());
            int remainder = (int)((prefixSum[i] % M + M) % M); // 음수 처리를 방지하기 위해
            count += remainderCount[remainder]; // 해당 나머지를 가진 누적합의 개수를 결과에 더함
            remainderCount[remainder]++; // 현재 나머지의 빈도수 업데이트
        }

        // 첫째 줄에 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 출력한다.
        bw.write(Long.toString(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
