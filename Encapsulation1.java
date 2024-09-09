class Encapsulation1 {
  
        private String name;
        private int age;
    
        public Encapsulation1(String name, int age) {
            this.name = name;
            this.age = age;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public int getAge() {
            return age;
        }
    
        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            } else {
                System.out.println("Age must be positive.");
            }
        }
 

    }
    class Enc{
        public static void main(String[] args) {
            Encapsulation1 en = new Encapsulation1("Programming", 13);
            en.setAge(35);
            System.out.println(en.getAge());
        }
    }
