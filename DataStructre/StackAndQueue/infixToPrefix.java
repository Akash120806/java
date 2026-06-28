import java.util.*;

public class infixToPrefix {
    // public static String infixtoprefix(String s) {
    // return s;
    // }

    public static String reverseNSwap(String s) {
        StringBuilder result = new StringBuilder(s).reverse();
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '(') {
                result.setCharAt(i, ')');
            } else if (result.charAt(i) == ')') {
                result.setCharAt(i, '(');
            }

        }
        return result.toString();
    } 

    public static int prec(char c) {
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

    public static String revinfixtopostfix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    result.append(st.pop());
                }
                st.pop();
            } else {
                while (!st.isEmpty() && prec(st.peek()) >= prec(c)) {
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

    public static String revesePostfix(String s) {
        StringBuilder result = new StringBuilder(s).reverse();
        return result.toString();
    }

    public static void main(String[] args) {
        String exp = "A+B*(C*D)-E";
        String s = reverseNSwap(exp);
        String st = revinfixtopostfix(s);
        System.out.println(revesePostfix(st));// - + A * B * C D E

    }
}
