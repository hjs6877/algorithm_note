package com.itvillage.string;

/**
 * 앞으로 읽으나 뒤로 읽으나 같은 문자열
 */
public class PalindromeMirror {
    public static void main(String[] args) {
        String str = "lemel";
        boolean isPalindrome01  = isPalindrome01(str);
        System.out.println(isPalindrome01);

        boolean isPalindrome02  = isPalindrome02(str);
        System.out.println(isPalindrome02);
    }

    /**
     * 좌우 문자열을 대칭시켜서 찾는 방법
     */
    private static boolean isPalindrome01(String s) {
        int len = s.length();
        int left = 0;
        int right = len - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        return isPalindrome;
    }

    /**
     * 문자열의 절반만 비교하는 방법
     *  - 서로 대칭이므로 전부 다 비교할 필요가 없이 때문에 조금 더 나은 성능을 보여준다.
     * @param s
     * @return
     */
    private static boolean isPalindrome02(String s) {
        int len = s.length();

        boolean isPalindrome = true;
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }
}
