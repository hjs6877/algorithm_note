package com.itvillage.math;

/**
 * 접두사 합(누적 합계)을 이용한 구간 합 구하기
 */
public class FromToSums {
    public static void main(String[] args) {
        int[] n = {10, 20, 30, 40, 50};
        int[][] m = {{1, 3}, {3, 4}};
        int[] prefixSum = new int[n.length + 1];

        prefixSum[0] = 0;
        for (int i = 1; i <= n.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + n[i - 1];
        }

        for (int i = 0; i < m.length; i++) {
            /**
             * 구간 합 = prefixSum[Right] - prefixSum[Left - 1]
             * - 해당 구간 이 전에 누적이 된 값들은 빼주어야 하므로 prefixSum[Left - 1]을 빼준다.
             */
            int sum = prefixSum[m[i][1]] - prefixSum[m[i][0] - 1];
            System.out.print(sum + " ");
        }
    }
}
