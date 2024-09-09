class Test{  
    void Str(){
        System.out.println("string");
    }  
    }  
class Dog extends Test{  
    void hr(){
        System.out.println("Inheritance");
    }  
    }  
    class Inheritance1{  
    public static void main(String args[]){  
     Test te =new Test();  
     Dog de=new Dog();
    de.Str();
    de.hr();  
    }}  



