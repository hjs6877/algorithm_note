package com.itvillage.math;

import java.util.Arrays;

/**
 * 배열에서 Max 값 찾기
 */
public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int result1 = solution01(arr);
        System.out.println(result1);

        int result2 = solution02(arr);
        System.out.println(result2);
    }

    /**
     * Math 클래스 사용
     */
    private static int solution01(int[] arr) {
        int max = 0;
        for (int n : arr) {
            max = Math.max(max, n);
        }
        return max;
    }

    /**
     * 스트림 사용
     */
    private static int solution02(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        return max;
    }
}
