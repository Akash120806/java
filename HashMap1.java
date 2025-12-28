import java.util.HashMap;
public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer>newmap=new HashMap();
        // insert value in map
        //mapname.put(key,value)
        
        newmap.put("india",120 );
        newmap.put("pak",10);
        newmap.put("aus",110 );
        newmap.put("russ",120 );
        newmap.put("indonesia",90 );
        
        // to search if the key is present in map
       if( newmap.containsKey("india")){
        System.out.println(newmap.get("india"));
       }
       if( newmap.containsKey("aus")){
        System.out.println(newmap.get("russ"));// this statement will give the value of key
        
       }
       System.out.println(newmap);
       System.out.println(newmap.remove("indonesia"));
       System.out.println(newmap);
       System.out.println(newmap.size());
    }
    
}
