import java.util.Scanner;
public class MathDemo {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.print("Enter the value of A :");
        a = scanner.nextDouble();

        System.out.print("Enter the value of B :");
        b= scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.print("The hypotenous of c is :" + c);

       scanner.close();
    }

}
