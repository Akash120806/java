package tools;


 public class Tools{
    
    
    public int[][] num(){
        
      //  int a =(int)(Math.random())*100;
        
        int[][] a= new int[4][3];
        for(int c=0;c<4;c++){
            for (int d=0;d<3;d++){
                int b=(int)((Math.random())*100);
                a[c][d]=b;
            }

        }

       

    return a;
}
}



 
    

    
