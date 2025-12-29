

class Cons{
    Cons(){
        System.out.println("Make anthoer constructor of different type ");
    }
    Cons(int a){
        System.out.println("This constructor prints"+a);
    }
}


class Dev extends Cons{

    public Dev() {
        System.out.println("This is derived constructor");
    }
    Dev(int a){
        System.out.println("This is another constructor which prints "+a);
    }
    
}

public class InheritanceConstructor {
    public static void main(String[] args) {
        Dev co= new Dev(4);
    }
    
   
    
    
    
}
