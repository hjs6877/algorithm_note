package com.itvillage.direction;

import java.util.Arrays;

/**
 * 배열의 원소를 좌(0)/우(1)로 n 만큼 회전하는 예제
 */
public class RotateNumber {
    public static void main(String[] args) {
        int[] arr = {12, 39, 30, 23, 11};
        int[] result = rotate(arr, 0, 3);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static int[] rotate(int[] arr, int d, int n) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            int idx = -1;
            // 왼쪽으로 회전
            if (d == 0) {
                if (i - n < 0) {
                    idx = arr.length - (n - i);
                } else {
                    idx = i - n;
                }
            } else if(d == 1) { // 오른쪽으로 회전
                idx = (i + n) % arr.length;
            }
            arr[idx] = copy[i];
        }
        return arr;
    }
}
