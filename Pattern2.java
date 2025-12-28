class Pattern // pattern printing
{
    public static void main(String a[])
    {
        // System.out.print("*");
        // System.out.println();

        // System.out.print("**");
        // System.out.println();
        // System.out.print("***");
        int n = 5; // Number of rows
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}