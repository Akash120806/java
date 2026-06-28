import java.util.*;

public class PrefixToInfix {
    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public static String pretoin(String s) {
        Stack<String> st = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                st.push(String.valueOf(c));

            } else if (isOperator(c)) {
                String op1 = st.pop();
                String op2 = st.pop();
                String infix = "(" + op1 + c + op2 + ")";
                st.push(infix);
            }

        }
        return st.peek();

    }

    public static void main(String[] args) {
        String infix = "*+AB-CD";
        String convert = pretoin(infix);
        System.out.println(convert);

    }
}
