import java.util.Scanner;

public class ifstatements {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int age;

        String name;

        Boolean isstudent;

        System.out.print("Enter your name :");
        name = scanner.nextLine();
        System.out.print("Enter your age :");
        age = scanner.nextInt();
        System.out.print("Are you Student  :");
        isstudent = scanner.nextBoolean();

        if (age>=18){
            System.out.println("Your an adult !");
        }

        else if (age<0) {

            System.out.println("You have not born yet !");

        } else if (age==0) {

            System.out.println("You have just born yet!");

        } else if (age>=75) {
            System.out.println("you are senior !");
        }
        else{

            System.out.println("ou are not an adult");
        }
        if (name.isEmpty()){
            System.out.println("You have not entered your name ");
        }
        if (isstudent){
            System.out.println("you're a student");
        }
        else {
            System.out.println("Your are adult");
        }

    }
}
