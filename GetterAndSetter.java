class GetSet{
   private  int id;
     private String name;
     private int app;

    public String getname(){
        return name;

    }
    public void Setname(String na){
        name=na;
    }
    public int getid() {
        return id;

    }
    public void Setid(int i){
        
        id=i;
    }
    void Setapp(){
        
    }

     void Getapp(){

    }
    
}




public class GetterAndSetter {
    public static void main(String[] args) {
        GetSet gs= new GetSet();
        gs.Setname("Axe");
        String r=  gs.getname() ;
        System.out.println(r);
        gs.Setid(12);
        System.out.println(gs.getid());
    }
}
