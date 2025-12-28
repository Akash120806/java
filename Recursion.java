public class Recursion {
    static void factorial(int N){
        if(N>=1){
            System.out.print(N +" ");
            factorial(N-1);
           
    }
        //return N;
}
    public static void main(String[] args) {
       factorial(10);
}
}