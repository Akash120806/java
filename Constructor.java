public class Constructor {
    public Constructor(String a,int i){/*constructor dont have any return type even not void and dont need to create any object for it */
      int id=i;
      String s=a;
    
    }
}
class Main{
    public static void main(String[] args) {
        Constructor cs= new Constructor("Axe", 98);
        System.out.println(Constructor);
    }
}