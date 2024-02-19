// import java.util.*;
// public class array{
//     public static void main(String[] args){
//         // int[] marks = new int[3];
//         // marks[0]=98;
//         // marks[1]=88;
//         // marks[2]=86;
//         int marks[] ={98,88,86};
//         // System.out.println(marks[0]);
//         for(int i=0; i<3; i++){
//             System.out.println(marks[i]);
//         }
//     }
// }

//Create an array by taking input from the user.
import java.util.*;
public class array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[]= new int [size];
        for(int i = 0 ; i<size;i++){
            number[i] = sc.nextInt();
        }
        for(int i =0; i <size; i++){
            System.out.println(number[i]);
        } 
    }
}
