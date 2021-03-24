package com.itvillage.search;

/**
 * 특정 합을 가지는 부분 연속 수열이 몇개인지 찾기
 */
public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 2};

        // 합이 5일 경우를 찾아보자
        int n = 5;
        int s = 0;
        int e = 0;

        int count = 0;
        while (s < arr.length && e < arr.length) {
            int sum = 0;
            for (int i = s; i <= e; i++) {
                sum += arr[i];
            }

            // 포인터가 같고, 합이 같을 경우 end 포인터를 이동한다.
            if (s == e && sum == n) {
                count++;
                e++;
            } else if (sum > n) {   // 합이 n보다 클 경우 start 포인터를 늘린다.
                s++;
            } else if (sum == n) { // 합이 n과 같을 경우 start 포인터를 늘린다.
                s++;
                count++;
            } else if (sum < n) { // 합이 n보다 작을 경우 end 포인터를 늘린다.
                e++;
            }
        }

        System.out.print(count);
    }
}
