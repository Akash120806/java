public class MultiDimensionalArray { // MultiDimensional- an array which contains multiple array
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };// [3] is the main arrar or no.of arrays and [4] is the inner arrays no. of
          // elements
          // [4]
          // 0 1 2 3
          // 0|_||_||_||_|
          // [3] 1|_||_||_||_|
          // 2|_||_||_||_|
          // System.out.println(num[2][0]);
          // for (int i = 0; i < 3; i++) {
          // for (int j = 0; j < 4; j++) { // 0 8 16 24
          // num[i][j] = j * 8; // 0 8 16 24

        // // i++;

        // }

        // }
        // for (int i = 0; i < 3;) {
        // for (int j = 0; j < 4;) {
        // System.out.print(num[i][j] + " ");
        // j++;
        // }
        // System.out.println(" ");// n for th new line
        // i++;
        // }
        // // int s = num.length;
        // // System.out.println(s);
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][j] = 0;
                }

            }

        }
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

}
