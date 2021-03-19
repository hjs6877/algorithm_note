package com.itvillage.math;

import java.util.*;

/**
 * 약수 구하기
 */
public class Divisor {
    public static void main(String[] args) {
        int n = 12;
        List<Integer> divisors = findDivisor(n);

        System.out.print(divisors);
    }

    private static List<Integer> findDivisor(int n) {
        Set<Integer> divisorSet = new HashSet<>();
        for (int i = n; i > 0 ; i--) {
            if (n % i == 0) {
                divisorSet.add(i);
                divisorSet.add(n / i);
            }
        }
        List<Integer> divisors = new ArrayList<>(divisorSet);
        Collections.sort(divisors);
        return divisors;
    }
}
