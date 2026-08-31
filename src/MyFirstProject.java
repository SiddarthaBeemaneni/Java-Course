import java.util.Scanner;
public class MyFirstProject {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("Which item would you wish to order :");
        item = scanner.nextLine();
        System.out.print("Price of the item : ");
        price = scanner.nextDouble();
        System.out.print("How much Quantity would yu willing:");
        quantity = scanner.nextInt();
        total = quantity*price;
        System.out.print(total);

        System.out.println(currency);









    }




}
