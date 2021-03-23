package com.itvillage.math;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean result = isPrime(23);
        if (result) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }

    /**
     * 특정 숫자가 소수인지 판별
     */
    private static boolean isPrime(int num) {
        if(num == 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (i != num && num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
