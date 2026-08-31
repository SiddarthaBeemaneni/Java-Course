import java.util.Scanner;
public class PlaceHolder {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Sidartha";
        int age = 18;
        char gender = 'M';
        Boolean isStudent;

        System.out.print("Enter your name :");
        name = sc.nextLine();
        System.out.print("Enter Your Age :");
        age = sc.nextInt();
        System.out.print("Gender :");
        gender = sc.next().charAt(0);

        System.out.print("Are you a Student (TRUE/FALSE) :");
        isStudent = sc.nextBoolean();

        System.out.printf("Hello %s\n", name);
        System.out.printf("You are %d years old", age);



        if (isStudent){
            System.out.println("You are a Student\n");
        }
        else {
            System.out.println("You are not a student !\n");
        }
        if (age>=18){
            System.out.println("you are ELIIBLE for vote !");
        }
        else{
            System.out.println("you are not ELIGIBLE  for vote ");
        }





    }
}
