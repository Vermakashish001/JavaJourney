import java.util.*;
public class ifElse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if(age>=18){
        //     System.out.println("adult");
        // }else{
        //     System.out.println("child");

        // }

        // int num = sc.nextInt();
        // if(num % 2 == 0){
        //     System.out.println("even");
        // }else{
        //     System.out.println("odd");
        // }

        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
                System.out.println("equal");
        }else if (a>b){
            System.out.println("a is greater");
        }else{
            System.out.println("a is lasser");
        }    
    }
}