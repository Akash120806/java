public class MultiDimensionalArray {       //  MultiDimensional- an array which contains multiple array
    public static void main(String[] args) {
        int[][] num=new int[3][4];//[3] is the main arrar or no.of arrays and [4] is the inner arrays no. of elements
                                  //            [4]                                  
                                  //       0  1  2  3
                                  //     0|_||_||_||_| 
                                  // [3] 1|_||_||_||_| 
                                  //     2|_||_||_||_|
                              //System.out.println(num[2][0]);      
    for(int i=0; i<3;i++){
        for(int j = 0;j<4;j++){  // 0 8 16 24
            num[i][j]=j*8 ;      // 0 8 16 24
            

            //i++;

        }
        
    }    
    for(int i=0; i<3;){
        for(int j = 0;j<4;){
            System.out.print(num[i][j] +" "); 
            j++;
        }
        System.out.println(" ");//n for th new line
        i++;
    }    
                        
                              
     
    }
    
    
}
