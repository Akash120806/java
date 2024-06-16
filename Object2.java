import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Player{
    public void mplayer()
    {
        System.err.println("playin music for free");

    }
    public String dvd (String abc, int cost)
    {
        if(cost>=10){
            System.out.println("dvd is playing");
        }
        return "more money required";


    }
   
}
 class Player1{
    public void mplayer()
    {
        System.err.println("playin music for free");

    }
    public String dvd (String abc, int cost)
    {
        if(cost>=10){
            System.out.println("dvd is playing");
        }
        return "more money required"+abc;


    }
   
}
public class Object2 {
    public static void main(String[] args) {
        Player arg = new Player();//creating object of class player(object name arg)
        arg.mplayer();
       String cdf= arg.dvd("abc",2);
       System.out.println(cdf);
       Player1 ply=new Player1();
       List<String> list=new ArrayList();
       Map<String,String> map=new HashMap();
       Set<String> set=new HashSet<>();



    }

//    // accessModifier nonAccesssModifier* returnType functionName(parameters(datatype+ variableName)){
//         functionality
//     }
 //   functionName(parametersValue)
    
}
