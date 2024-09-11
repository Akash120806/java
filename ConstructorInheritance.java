 class Base{
    public Base(){
        System.out.println("I am a constructor");
    }
    public String Str(String m){
        return m;

    } 
    Base(int i){
        System.out.println(i);
    }

}

class ConstructorInheritance{
    public static void main(String[] args) {
        Base b= new Base();
        Base be= new Base(45);

        
    }

}