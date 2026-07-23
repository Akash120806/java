public class BinaryExponention {
    


    static long power(long base, long pow) {

        // This variable will store our final answer.
        //
        // We start with 1 because multiplication starts with 1.
        // Example: 1 * 2 = 2
        long ans = 1;

        // Keep running until power becomes 0.
        while (pow > 0) {

            // If power is ODD:
            //
            // Example: 2^5
            //
            // 2^5 = 2 * 2^4
            //
            // We take out one '2' and store it in ans.
            // The remaining power becomes easy to handle
            // by squaring the base and dividing power by 2.
            if (pow % 2 == 1) {
                ans = ans * base;
            }

            // Square the base.
            //
            // Example:
            // 2^10 = 4^5
            //
            // So:
            // base: 2 -> 4
            //
            // Another example:
            // 4^4 = 16^2
            //
            // So every time we divide the power by 2,
            // we square the base.
            base = base * base;

            // Divide power by 2.
            //
            // Since pow is an integer type:
            // 10 / 2 = 5
            //  5 / 2 = 2
            //  2 / 2 = 1
            //  1 / 2 = 0
            //
            // If power was odd, its extra base was already
            // multiplied into ans above.
            pow = pow / 2;
        }

        // When pow becomes 0,
        // ans contains base^power.
        return ans;
    }

    public static void main(String[] args) {

        long result = power(2, 10);

        System.out.println(result); // 1024
    }
}