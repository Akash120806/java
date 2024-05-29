public class logicalop3 {
    public static void main(String[] args) {
        int x=-40;int y=87; float a=45.8f; byte b = 127;
        boolean res= x>a;
        boolean resul=x>=-41;
        boolean no = res && resul || resul;
        System.out.println(no); 
        System.out.println(!no);
     }
    
}
