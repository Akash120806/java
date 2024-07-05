public class Nested2 {
    public static void main(String[] args) {
        int x=45;
        int y=50;
         // while(x+y<=100){
            System.out.println(x+y);
            System.out.println("*");
            int j=1;
            while(j<=9){
                switch (j)
                
                {
                    
                    case 1:
                        System.out.println("sunday");
                        break;
                    case 2:
                        System.out.println("monday");
                        break;
                     case 3:
                        System.out.println("tuesday");
                        break;
                     case 4:
                        System.out.println("wednesday");    
                        break;
                     case 5:
                        System.out.println("thrusday"); 
                        break;
                    case 6:
                        System.out.println("friday"); 
                        break;
                    case 7:
                        System.out.println("saturday");
                        break;
                    default:
                        System.out.println("not valid");


                }
                j++;
            }
            x++;
        }
    }
//}
