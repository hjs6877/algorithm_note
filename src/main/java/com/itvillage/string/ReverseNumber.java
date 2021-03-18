package com.itvillage.string;

public class ReverseNumber {
    public static void main(String[] args) {
        String result = reverseRemoveZero("12300");
        System.out.print(result);
    }

    /**
     * 문자열 숫자 reverse
     * - reversed 된 숫자의 0으로 시작하면 0을 제거한다.
     */
    public static String reverseRemoveZero(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
