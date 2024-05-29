// &&,&=AND  ; ||,|= OR  ; !=NOR
public class logicalop {
    public static void main(String args[])
    {
        int x=54;
        double y=54.54;
        int a=98;
        double b=98.0;
        boolean result =  x < y  && a==b;
        System.out.println( result);
        boolean resul =  x <y  || a!=b;

        System.out.println(resul);
        
        
    }
    
}
