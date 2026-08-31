import java.util.Scanner;
public class ScannerDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = sc.nextLine();
        System.out.println("Hello" + " " + name);
        System.out.print("Enter your marks :");
        int marks = sc.nextInt();
        System.out.println("you were scored" + " " + marks + " " + "in mathematics");
        System.out.println("you brother belongs saveetha university (true/false) :");
        boolean condition = sc.nextBoolean();
        if(condition){
            System.out.println("Yes my brother belongs to saveetha university");
        }
        else{
            System.out.println("No he completed his graduation in SRM university");
        }
        System.out.println("What's your total SGPA:");
        float sgpa = sc.nextFloat();
        if(sgpa>=50){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        sc.close();
    }
}