import java.util.*;

public class NextGreaterElement1 {
    public static int[] nextGrater(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            while (!st.isEmpty() && st.peek() <= num) {
                st.pop();
            }
            if (st.isEmpty()) {
                arr[i] = -1;
            } else {
                arr[i] = st.peek();
            }
            st.push(num);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 8, 1, 2, 3 };
        int[] result = nextGrater(arr);
        System.out.println("Next Greater Elements:");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
