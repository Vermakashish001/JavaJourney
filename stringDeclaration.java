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
    }
}