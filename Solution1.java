import java.util.*;




public class Solution1 {
    // Method to find common elements
    public ArrayList<Integer> commonelement(int[] v1, int[] v2) {
        ArrayList<Integer> start = new ArrayList<>();
        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v2.length; j++) {
                if (v1[i] == v2[j]) {
                    start.add(v1[i]);
                }
            }
        }
        return start;
    }
}
class Test {
    public static void main(String[] args) {
        Solution1 so = new Solution1();
        Scanner sc = new Scanner(System.in);

        // Input for the first array
        System.out.println("Length of first array:");
        int n = sc.nextInt();
        int[] v1 = new int[n];
        System.out.println("Fill the element of array v1:");
        for (int i = 0; i < n; i++) {
            v1[i] = sc.nextInt();
            if (i == n - 1) {
                System.out.println("The array is filled as per your instruction.");
            }
        }

        // Input for the second array
        System.out.println("Length of second array:");
        int m = sc.nextInt();
        int[] v2 = new int[m];
        System.out.println("Fill the element of array v2:");
        for (int j = 0; j < m; j++) {
            v2[j] = sc.nextInt();
            if (j == m - 1) {
                System.out.println("The array is filled as per your instruction.");
            }
        }

        // Get common elements
        ArrayList<Integer> arr = so.commonelement(v1, v2);

        // Output the common elements
        System.out.println("Common elements are:");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}