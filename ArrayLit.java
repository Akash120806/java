




class Fun{
    public int[][] add(){
        int[][]  num= new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                int a = (int)(Math.random()*100);
                num[i][j]=a;
            }
        }     
        
        return num;
    }
    
    
     
    
    
}

 public class ArrayLit { 
    public static void main(String [] args) {
        Fun fu=new Fun();
        int[][]  num=fu.add();
        for(int r[]:num){
            for(int row:r){
                System.out.print(row);
            }
        }

    } 

    
    
}







