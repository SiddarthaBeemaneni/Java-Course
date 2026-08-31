import java.util.Scanner;
public class NestedStatements {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean isStudent;
        Boolean isEnmployee;
        double price = 1000.99;

        System.out.print("Are you a Student or employee (TRUE / FALSE): ");
        isStudent = scanner.nextBoolean();

        if (isStudent){
            System.out.println("You are a Student !");

            if (isStudent){

                System.out.println("Since you are  student ! You got 90% discount : ");
                price = price / 10;
                System.out.println("The payable amount is : " + price);

            }

        }

        else{
            System.out.println("You are an Employee !");
            System.out.println("Since you are an Employee ! you got 90% discount ");
            price =price / 10;
            System.out.println("The payable Amount" + " " +  price);
        }
    }

}
