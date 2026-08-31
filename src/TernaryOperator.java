import java.util.Random;
import java.util.Scanner;

public class TernaryOperator {
    static void main(String[] args) {
       /* Random random = new Random();
        Boolean isHeadoristail = random.nextBoolean();
        String result = (isHeadoristail) ? "Heads" : "Tails";
        System.out.println(result);*/
        Scanner scanner = new Scanner(System.in);
        int age ;
        System.out.print("Enter your age :");
        age = scanner.nextInt();
        String result = (age==59) ? "You are eligible !" : "You are nnot eligible";
        System.out.println(result);
    }
}
