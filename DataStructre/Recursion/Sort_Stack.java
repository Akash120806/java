import java.util.Stack;

public class Sort_Stack {
    


    public void sortStack(Stack<Integer> st) {

        if (st.size() <= 1)
            return;

        int top = st.pop();

        sortStack(st);

        insert(st, top);
    }

    private void insert(Stack<Integer> st, int x) {

        if (st.isEmpty() || st.peek() <= x) {
            st.push(x);
            return;
        }

        int temp = st.pop();

        insert(st, x);

        st.push(temp);
    }
}
