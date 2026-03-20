import java.util.Stack;
import java.util.*;

class InfixToPostfix {
    public static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;

        }
        return -1;

    }

    public static String intopost(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(s.charAt(i))) {
                result.append(c);
            } else if (s.charAt(i) == '(') {
                st.push(c);
            } else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    result.append(st.pop());
                }
                st.pop();
            } else {
                while (!st.isEmpty() && precedence(st.peek()) >= precedence(c)) {
                    result.append(st.pop());
                }
                st.push(c);
            }

        }
        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        return result.toString();

    }

    public static void main(String[] args) {
        String exp = "a+b-c*d/e+f";
        System.out.println(intopost(exp)); // Output: ABD-*E/+
    }
}
