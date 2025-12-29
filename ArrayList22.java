import java.util.*;

public class ArrayList22 {
    public static void main(String[] args) {
        System.out.println("here are all the function of Arraylist");
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i=0;i<10;i++){
            int r=(int) (Math.random()*100);
            arr.add(r);
        }
       
       System.out.println( arr.get(2));//used to get element by specifying index
        arr.add(5,1);// this will add the element 1 in index number5 but it will not rmove the number which was before in index number ,it will add an1in index5 and the previous number jump in index no.6 so the length of arraylist increase
        arr.set(0, 14);//this willchange the element of given index add(index,element )add the element without remoing pevious number but set remove and add new elemnt where you want to add
        
        System.err.println(arr);
        ArrayList<Integer> arr1=new ArrayList<>();
        for (int i=0;i<10;i++){
            int r=(int) (Math.random()*1000);
            arr1.add(r);
        }
        System.out.println(arr.contains(88));//return true or false and check if arr contains 88 

       arr.addAll(arr1);//we can add only the collections in ArrayList not a array so it will add the arr1 to arr but at last to add it on any Specific index or in the first we have to provide index no. just we use in add function
       System.out.println(arr.indexOf(82));//give the index no. of the element
       // if the output is -1 it means that the element is not on the list 
       System.out.println();
    }
    }
   
