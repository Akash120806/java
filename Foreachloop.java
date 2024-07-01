import tools.Tools;


public class Foreachloop {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Tools sts = new Tools();
        int[][] t = sts.num();
        
        
        for (int[] row : t) {
           
            for (int ol : row) {
                System.out.print(ol+ " ");
            }
            System.out.println();
        }
    }
}
