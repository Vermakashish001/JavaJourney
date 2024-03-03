import java.util.*;
public class Recursion{
    static int n = 0;
    public static void printOne(){
        if(n==4){
            return;
        }
        else{
            System.out.println(n);
            n++;
            printOne();
        }
    }
    public static void main(String[] args){
        printOne();
    }
    
}