public class QuickSorting {
    public static void Sort(int[] arr, int start, int end) {
        int pivot = part(arr, start, end);
        if (start < end) {
            Sort(arr, start, pivot - 1);
            Sort(arr, pivot + 1, end);
        }
    }

    public static int part(int[] arr, int start, int end) {
        int pivot = arr[end]; // 9
        int i = start - 1;// 0 1 2
        // 8 10 5 4 9

        for (int j = start; j < arr.length; j++) {
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
        arr[end] = tem;
        return i;
    }

}
