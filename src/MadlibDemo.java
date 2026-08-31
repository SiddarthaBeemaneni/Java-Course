import java.util.Scanner;
public class MadlibDemo {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;
        System.out.print("Enter adjective1 : ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter noun : ");
        noun1 = scanner.nextLine();
        System.out.print("Enter adjective2 : ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter verb1 : ");
        verb1 = scanner.nextLine();
        System.out.print("Enter adjective3 : ");
        adjective3 = scanner.nextLine();

        System.out.println("Today" +noun1 + "told me that he went to a zoo.");
        System.out.println("There he saw a" + noun1);
        System.out.println("Which is very scary.");
        System.out.println("and it is " + verb1 + "in the cage.");
        System.out.println("And he taken a selfie with the lion in the cage.");

    }
}
