public class Test16 {
    public static void main(String[] args) {
        int[] arr= {4, 1, 3, 9, 7};
        int n = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted part
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
       

    }
    
}
