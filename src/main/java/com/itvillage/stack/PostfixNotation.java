package com.itvillage.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * 후위 표기식 만들기
 */
public class PostfixNotation {
    public static void main(String[] args) {
        String ex = "3+5*2/(7-2)";
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < ex.length(); i++) {
            char ch = ex.charAt(i);

            // 숫자일 경우 출력
            if (Character.isDigit(ch)) {
                System.out.print(ch);
                continue;
            }

            // Stack 이 비어있다면 연산자를 Stack 에 추가한다.
            if (s.isEmpty()) {
                s.push(ch);
            } else {
                // '('를 만난다면 'C'를 Stack 에 추가한다.
                if (ch == '(') {
                    s.push(ch);
                } else if(ch == ')'){ // ')'를 만난다면 '('를 만나기전까지 Stack 에 있는 연산자를 꺼낸다.
                    while (s.peek() != '(') {
                        System.out.print(s.peek());
                        s.pop();
                    }
                    s.pop(); // '('를 마지막으로 꺼낸다.
                } else {
                    // Stack 에서 꺼낸 연산자가 비교 할 연산자보다 우선 순위가 같거나 높은 경우 Stack 에 있는 연산자를 꺼내서 출력한다.
                    if ((s.peek() == '*' || s.peek() == '/') && ((ch == '*' || ch == '/') || (ch != '*' && ch != '/'))) {
                        System.out.print(s.peek());
                        s.pop();
                    }

                    // Stack 에서 꺼낸 연산자가 비교 할 연산자보다 우선 순위가 작다면 비교할 연산자를 Stack 에 추가한다.
                    s.push(ch);
                }
            }
        }

        // Stack 에 남아있는 모든 연산자를 출력한다.
        while (!s.isEmpty()) {
            System.out.print(s.peek());
            s.pop();
        }
    }
}
