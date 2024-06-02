public class If2 {
    public static void main(String[] args) {
        int x= 48845;
        byte y=54;
        int z =6;
        if (y>=x & y>z){
            double r=x*0.00;
            int g =(int)r;

            System.out.println(g);
        
        }
        else if (x>y && x>z){
            System.out.println(y);
        }
        else{
            System.out.println(z);
        }
    }
    
}
