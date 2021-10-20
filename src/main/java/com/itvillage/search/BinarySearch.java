package com.itvillage.search;

import java.util.Arrays;

/**
 * 이진 탐색. target 숫자가 위치한 index 구하기
 */
public class BinarySearch {
    public static void main(String[] args) {
        int n = 8;
        int target = 32;
        int[] arr = {23, 87, 65, 12, 57, 32, 99, 81};

        Arrays.sort(arr);

        int result = binarySearch(arr, target);

        System.out.print(result);
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end)/2;

        while (start <= end) {
            /**
             * arr[mid]가 target 보다 크다면,
             *  - end 는 mid - 1
             *  - mid를 다시 구한다.
             * arr[mid]가 target 보다 작다면,
             *  - start 는 mid + 1
             *  - mid는 다시 구한다.
             */
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
            mid = (start + end)/2;
        }
        return -1;
    }
}
