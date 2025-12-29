public class Testing {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1, 1, 1 };
        int n = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {

            while (i < nums.length && nums[i] == 1) {
                n++;
                i++;
            }
            if (n > temp) {
                temp = n;
                n = 0;

            }
        }
        System.out.println(temp);
    }
}
