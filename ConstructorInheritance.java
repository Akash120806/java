 class Base{
    String m;
    public Base(){
        System.out.println("I am a constructor");
    }
    public String Str(String m){
        return this.m;

    } 
      Base(int i){
        System.out.println(i);
    }
    public void Main(String a){
        System.out.println(a);
    }

}
class Der extends Base{
    public void Der(){
        System.out.println("I am a Derived class");
    

    }
}
class ConstructorInheritance{
    public static void main(String[] args) {
        /*Base b= new Base();
        Base be= new Base(445);*/
        Der de =new Der();
       /*  de.Main("Student");
        de.Der();*/


        
    }

}

