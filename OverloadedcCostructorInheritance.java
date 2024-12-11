class New{
   
    
    New() {

        System.out.println("you call constructor with no argument");
    }
    New(int a){
        
        System.out.println(a+"you are in constructor");
    }
 }
 class Der extends New{
    


    Der(){
       
  
        System.out.println("you are in chid constructor");

    }

     Der(int c) {        
        super(c);

        System.out.println(
            "You are in derived constructor arg"
        );
        
    }
    

 }
 class Gc extends Der{

    public Gc() {
        System.out.println("you are in grand child constructor");
    }
    Gc(int d,int e){
        
        super(d);
        System.out.println("you are in grand child cons with args");
    }
 }
 class OverloadedcCostructorInheritance {
    public static void main(String[] args) {
        Gc g=new Gc();
        
    }
    
}

