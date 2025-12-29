import java.util.Arrays;

class Roots{
    public double[] Root1(int A,int B ,int C){
      double  r1 = (-B + Math.sqrt((B * B) -( 4 * A * C))) / (2 * A);
        double r2 = (-B - Math.sqrt((B * B) -( 4 * A * C))) / (2 * A);
      double[] num= new double[2];
      num[0]=r1;
      num[1]=r2;
        return num;

    }
}
class Test5{
    public static void main(String[] args) {
        Roots rt=new Roots();
        double[] num= new double[2];
       num =  rt.Root1(-7 ,-3 ,-6 );
       System.out.println(Arrays.toString(num));
     
    }
}