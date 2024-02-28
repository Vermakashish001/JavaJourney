import java.util.*;
public class hashMap{
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap <>();
        // // Insertion 
        map.put("India",120);
        map.put("us",20);
        map.put("uk",12);
        map.put("pk",50);
        System.out.println(map);

        // // update 
        // map.put("uk",122);
        // System.out.println(map);

        // //search
        // if(map.containsKey("uk")){
        //     System.out.println("yes");
        // }else{
        //     System.out.println("no");
        // }

        // // value get 
        // System.out.println(map.get("uk"));
        // System.out.println(map.get("china"));

        // int arr[] = {12,11,13,14,16};
        // for(int i = 0; i<5; i ++){
        //     System.out.println(arr[i]+" ");
        // }
        // System.out.println();

        // for(int val : arr){
        //     System.out.println(val+" ");
        // }
        // System.out.println();

        //entrySet
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //keySet
        Set<String> keys = map.keySet();
        for(String key :keys){
            System.out.println(key+" "+map.get(key));
        }

        //remove
        map.remove("us");
        System.out.println(map);



    }
}