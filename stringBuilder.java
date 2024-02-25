// String in java are immutable

import java.util.*;
public class stringBuilder{
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder("kashish");
        System.out.println(sb);
    // Append
    sb.append("V");
    sb.append("e");
    sb.append("r");
    sb.append("m");
    sb.append("a");
    System.out.println(sb);
    System.out.println(sb.length());
    // char at index 0
    System.out.println(sb.charAt(0));
    
    //set char at index 0
    sb.setCharAt(0,'p');
    System.out.println(sb);

    //insert
    sb.insert(0,"x");
    System.out.println(sb);

    //delete
    sb.delete(0,1);
    System.out.println(sb);
    
    }
}