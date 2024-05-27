public class TypePromotion {
    public static void main(String a[])
    {
        byte c=10;
        byte b= 30;
        // result= a*b; will be error bcz it value will be more thN THE value of byte i.e 127
        // so we use the func. int
        int result= c*b;
        System.out.println(result);
    }    
}
