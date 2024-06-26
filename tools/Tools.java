package tools;


 public class Tools{
    
    
    public int[][] num(){
        
      //  int a =(int)(Math.random())*100;
        
        int[][] r= new int[4][3];
        for(int c=0;c<4;c++){
            for (int d=0;d<3;d++){
                int b=(int)((Math.random())*100);
                r[c][d]=b;
            }

        }

       

    return r;
}
}



 
    

    
