import java.util.*;

public class stringDeclaration{
    public static void main(String[] args){
        // String name ="kashish";
        // String fullName = "kashish Verma";
        // String sentance= "i am in pain";

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("your name is :" + name);

        String firstName = "kashish";
        String lastName = "verma";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName.length());

        //charAt
        for(int i =0;i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        //compare
        String name1 = "kashish";
        String name2 = "zebra";
        // 1 S1 > S2 : +ve valiue
        // 2 S1 == S2 :0
        // 3 S1 <s2: -ve value

        //hello wello 
        if(name1.compareTo(name2)==0){
            System.out.println("String are equal");
        }else {
            System.out.println("String are not equal");
        }

        //compare
        // String sentance = " My name is Kashish";
        String sentance = "KashishVerma";
        String name = sentance.substring(0,7);
        System.out.println(name);
    }
}
// strings are immutable