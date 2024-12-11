import java.util.Arrays;

public class Comparison {
    public static void main(String[] args) {
        // to compare arrays
        int[] num1={1,2,3,4};
        int[] num2={1,2,4,3};
        System.out.println(Arrays.equals(num1, num2));// Arrays.equals used to compare 1D  arrays
        //and all the elements must be same and also order must be same
        Arrays.sort(num1);
        Arrays.sort(num2);
            System.out.println(num2==num1);



    }
    
}
