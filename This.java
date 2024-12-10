class Test {
    int a;

    Test(int a) {
        this.a = a; // Assign the value of 'a' to the instance variable 'a'
        System.out.println(this.a); // Print the value of 'a'
    }
}

public class This {
    public static void main(String[] args) {
        Test te = new Test(44); // Create an object of class Test with 'a' set to 44
    }
}
