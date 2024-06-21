  class InnerObject {
    public int add(int n1,int n2){
        int r=n1+n2;
        System.out.println(r);
        return 0;
    }
    
 
    
 }



public class Object {
    public static void main(String[] args) {
        
    
    int num1=4;
    int num2=4;
    InnerObject inn =new InnerObject();
    
    int res= inn.add( num1 ,num2);
    System.out.println(res);
    
 }
}
