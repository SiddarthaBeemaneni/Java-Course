import java.util.Scanner;
public class CompoundInterestDemo {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principle;
        double rate;
        int timecompound;
        int years;
        double amount;

        System.out.print("Enter principle amount :");
        principle = scanner.nextDouble();
        System.out.print("Enter the rate :");
        rate = scanner.nextDouble() / 100;
        System.out.print("Enter the no.of timecompounds per year :");
        timecompound = scanner.nextInt();
        System.out.print("Enter no.of years:");
        years = scanner.nextInt();

        amount = principle * Math.pow(1 + rate / timecompound, timecompound * years);

        System.out.print("The total amount is :" + amount);






    }
}
