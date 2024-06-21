public class MultiDimensionalArray {       //  MultiDimensional- an array which contains multiple array
    public static void main(String[] args) {
        int num[][]=new int[3][4];//[3] is the main arrar or no.of arrays and [4] is the inner arrays no. of elements
                                  //            [4]                                  
                                  //       0  1  2  3
                                  //     0|_||_||_||_| 
                                  // [3] 1|_||_||_||_| 
                                  //     2|_||_||_||_|
                              //System.out.println(num[2][0]);      
    for(int i=0; i<3;){
        for(int j = 0;j<4;){
            num[i][j]=i*8 +8*j;
            j++;
        }
        i++;
    }    
    for(int i=0; i<3;){
        for(int j = 0;j<4;){
            System.out.print(num[i][j] +" "); 
            j++;
        }
        System.out.println(" ");// for th new line
        i++;
    }    
                        
                              
     
    }
    
    
}
