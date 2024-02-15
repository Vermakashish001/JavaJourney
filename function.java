// import java.util.*;
// public class function{
//     public static void printName(String name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String name= sc.nextLine();
//         printName(name);// call our function
//     }
// }

//add 2 num

// import java.util.*;
// public class function{
//     public static int addNum(int a,int b){
//         int sum = a+b;
//         // System.out.println(sum);
//         return sum;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a= sc.nextInt();
//         int b= sc.nextInt();
//         int sum = addNum(a,b);
//         System.out.println(sum);
//     }
// }

//multiply 2 num
import java.util.*;
public class function{
    public static int product(int a,int b){
        return a*b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        
        System.out.println("product of 2 num:"+product(a,b));
    }
}