import java.util.Stack;

public class ifixtopostfix {

    // Function to return precedence
    private static int prec(char c) {
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

    public static String infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If operand → add to output
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // If '(' → push into stack
            else if (c == '(') {
                st.push(c);
            }
            // If ')' → pop until '('
            else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    result.append(st.pop());
                }
                st.pop(); // remove '('
            }
            // Operator case
            else {
                while (!st.isEmpty() &&
                        prec(st.peek()) >= prec(c)) {

                    // For right-associative '^'
                    // if (c == '^' && st.peek() == '^')
                    // break;

                    result.append(st.pop());
                }
                st.push(c);
            }
        }

        // Pop remaining operators
        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String exp = "A+B*(C-D)/E";
        System.out.println(infixToPostfix(exp)); // Output: ABD-*E/+
    }
}
