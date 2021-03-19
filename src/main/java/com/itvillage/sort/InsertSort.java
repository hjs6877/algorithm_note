package com.itvillage.sort;

/**
 * 삽입 정렬
 *  - now 원소가 previous 원소보다 작다면 exchange 한다.
 *  - previous 의 index 가 0 일 때까지 비교한다.
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        for (int i = 1; i < arr.length; i++) {
            int now = i;
            for (int prev = now - 1; prev >= 0; prev--) {
                if (arr[now] < arr[prev]) {
                    int temp = arr[now];
                    arr[now] = arr[prev];
                    arr[prev] = temp;
                    now = prev;
                } else {
                    break;
                }
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
