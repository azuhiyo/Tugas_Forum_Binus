package binus.forum;
import java.util.Scanner;
public class Konversi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type any distances (in meters) " );
        double meter = input.nextDouble();
        double centimeter = meter * 100;

        System.out.println("Distance in cm is " + centimeter + "cm." );
    }
}
