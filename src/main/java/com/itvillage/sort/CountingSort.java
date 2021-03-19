package com.itvillage.sort;

/**
 * 계수 정렬
 *  - 중복 되는 숫자들이 있고, 가장 큰 데이터와 가장 작은 데이터의 차가 1,000,000을 넘지 않을 경우 사용
 *
 */
public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
        int[] count = new int[10];

        // count 배열의 index == 원소의 값인 개수를 counting 한다.
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // counting 된 수 만큼 출력한다.
        for (int i = 0; i < count.length; i++) {
            for (int j = count[i]; j > 0; j--) {
                System.out.print(i + " ");
            }
        }
    }
}
