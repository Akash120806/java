class Test {
    void Str() {
        System.out.println("string");
        System.out.println("Inheritance");
    }
}

class Inheritance1 {

}

class Dog extends Test {
    public static void main(String args[]) {
        Test te = new Test();
        Dog de = new Dog();
        de.Str();

    }
}
