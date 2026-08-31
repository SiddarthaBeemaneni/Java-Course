import java.sql.SQLOutput;
import java.util.Scanner;

public class EvenorOdd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
       System.out.println("Enter a number : ");
       num = sc.nextInt();
       /* if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }*/
        //ternary operator
        String result = (num%2==0) ? "Even" : "Odd";
        System.out.println(result);

    }
}
