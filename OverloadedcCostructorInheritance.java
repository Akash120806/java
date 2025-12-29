class New {
    New() {
        System.out.println("you call constructor with no argument");
    }

    New(int a) {
        System.out.println(a);
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
