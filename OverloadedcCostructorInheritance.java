class New {
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

class Der extends New {
    Der() {
        // Explicit no-argument constructor for the Der class
        System.out.println("you are in child constructor");
    }

    Der(int c) {
        super(c); // Calls the parent class (New) constructor with an argument
        System.out.println("You are in derived constructor arg");
    }
}

class Gc extends Der {
    public Gc() {
        // Gc() calls super() implicitly, so we need the Der() constructor to exist
        System.out.println("you are in grandchild constructor");
    }

    Gc(int d, int e) {
        super(d); // Calls Der(int d)
        System.out.println("you are in grandchild cons with args");
    }
}

class OverloadedConstructorInheritance {
    public static void main(String[] args) {
        Gc g = new Gc(0, 6); // Calls the Gc(int d, int e) constructor
    }
}
