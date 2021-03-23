package com.itvillage.direction;

/**
 * 배열의 현재 위치에서 동서남북 탐색
 * - 봉우리 개수 구하기
 */
public class FourthDirectionSearch {
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static int n = 5;
    public static int[][] arr = {{5, 3, 7, 2, 3}, {3, 7, 1, 6, 1}, {7, 2, 5, 3, 4}, {4, 3, 6, 4, 1}, {8, 7, 3, 5, 2}};

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(isTop(i, j)) count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isTop(int x, int y) {
        // 상, 하, 좌, 우 탐색
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
            if(arr[x][y] < arr[nx][ny]) return false;
        }
        return true;
    }
}
