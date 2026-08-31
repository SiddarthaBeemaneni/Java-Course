import java.util.Scanner;

public class Switch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
             /*   int day;*/
        String day;
        String result;
        System.out.println("Enter a Day :");
        day = sc.nextLine();
        /*
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            default :
                System.out.println("Please enter a valid number !");
        } */


        /*
        switch (day){
            case "Sunday" ,"Monday" :
                System.out.println("8am");
                break;
            case "Tuesday" :
                System.out.println("6am");
                break;
            default :
                System.out.println("7am");
        }

         */
        /*
        switch (day){
            case "Sunday" ,"Monday" ->System.out.println("8am");
            case "Tuesday" -> System.out.println("6am");

            default-> System.out.println("7am");
        }


         */
        switch (day){
            case "Sunday" ,"Monday" :yield "8am";
            case "Tuesday" : yield "6am";

            default : yield "7am";
        }

        System.out.println(result);

    }
}
