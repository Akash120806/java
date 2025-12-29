
abstract class Abs{
    //Here we are using the abstract method .The abstract function is a method to define methods and function and provide functions to other class
    // We can't make the object of a abstract class and and class that extends the abstract class should also be abstract or using the method of the abstract class.
    // An abstact method (not class) doesn't have any body means not any thing under curly bracet{}even not have any {} the statement end with ;
    /* 
       ***
       now why , the abstract function doesn't have any body because the main work of abstract function is to implement the value 
       to the method where it is called and its uses change according to the functionality of other method which called it like we specify
       the value or content to method greet on class parent and anything else on any other function.
       abstract keyword cant be used in such funtion which is using the function like private and final because the content of the variable is fixed but in 
       abstraction it change function to function
    */
   
    abstract public void Parent();
   abstract void greet();
}
abstract class Parents extends Abs{
   // we cant make object of this class and the above class because these are abstract classes
    // As it extends the abstract class it should have the abstract function/method of the Parent class Abs or the class should be abstract class

     void fun(){
        System.out.println("Have fun");
    }

    @Override
    public void Parent() {
        System.out.println("Parent method implemented");
    }

    @Override
    void greet() {
        System.out.println("Greet method implemented");
    }
    }
class Greet extends Parents{
    public void Str(){
        System.out.println("this is Non abstracted class");
    
    }
    @Override
    void greet(){
        System.out.println("good evening ");
    }
    @Override
        public
        void Parent(){
            System.out.println("Hello");
    
        }

}

public class Abstract {
    public static void main(String[] args) {
        Greet pa= new Greet();
        pa.Str();    
        pa.Parent();
        pa.fun();    
        pa.greet();
    }
    
}
