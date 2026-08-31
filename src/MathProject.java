import java.util.Scanner;
public class MathProject {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double radius;
        double circumference;
        double area;
        double volume;
        System.out.print("Enter Radius :");
        radius = scanner.nextDouble();
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.println("Circumference of Corcle is :" + circumference +"cm");
        System.out.println("Area of Corcle is :" + area + "cm^2");
        System.out.println("Volume of Corcle is :" + volume + "cm^3");

        scanner.close();




    }
}
