import java.util.*;
public class Hashing{
    public static void main(String [] args){
        HashSet<Integer> set = new HashSet<>(); 
        // Inset
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // search 
        // if(set.contains(1)){
        //     System.out.println("set contain 1");
        // }
        // if(!set.contains(6)){
        //     System.out.println("does not contain");
        // }

        // //delete
        // set.remove(1);
        // if(!set.contains(1)){
        //     System.out.println("we deleted 1");
        // }

        //size
        System.out.println("size of set is :"+ set.size());
        
        //print all element 
        System.out.println(set);

        //Iterator - hasNext ; Next
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}