import java.util.Scanner;
public class StringmethondsDemo {
    static void main(String[] args) {
        String name ;
        //int length = name.length();
        //char charAt = name.charAt(8);
        //int index = name.indexOf("a");
        //int Lastindex = name.lastIndexOf("a");
        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name.trim();
        //name = name.replace("a", "u");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name :");
        name = scanner.nextLine();


        /* if (name.isEmpty()){
            System.out.println("name is empty !");
        }
        else {
            System.out.println("The Name is not empty");
        }*/

       if (name.equalsIgnoreCase("password")){

           System.out.println("The Name should not be the Password");

       }
       else {
           System.out.println("The name should is valid");
       }

    }
}
