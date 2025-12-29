public class Quicksrt {
    public static void Sort(int[] arr, int small, int large) {
        int pivot = part(arr, small, large);
        if (small < large) {
            Sort(arr, small, pivot - 1);
            Sort(arr, pivot + 1, large);
        }
    }

    public static int part(int[] arr, int small, int large) {
        int pivot = arr[large];
        int i = small - 1;// we may directly store the value as low is the 0the index

        for (int j = small; j < arr.length; j++) { // we should use large
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        i++;
        int tem = arr[i];
        arr[i] = pivot;
        arr[large] = tem;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 8, 7, 6, 63, 3, 4, 8, 69, 7, 5 };
        Sort(arr, 0, arr.length - 1);
        System.out.println("\nAfter Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
