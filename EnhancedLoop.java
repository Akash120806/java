import java.util.Arrays;

import tools.Tools;

public class EnhancedLoop {
    
    public static void main(String [] args){
      //  int[][] op=new int[4][];
        Tools arr = new Tools();
        int[][] op = arr.num(0);
        for(int[] n:op){
            System.out.println(Arrays.toString(n));
        }
        Tools or =new Tools();
        int[][] r= or.num(0);
        for(int[]u:r){
            for(int ch:u){
              //  System.out.print("["+ch+"]");

            }
            System.out.println(" ");
        }

    }
}
