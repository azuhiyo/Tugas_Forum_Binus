package binus.forum;
import java.util.Scanner;
public class AutoCorrect {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Input lowercase text here" );
        String txt1 = input.nextLine();
        String txt2 = input.nextLine();

        System.out.println(txt1.toUpperCase());
        System.out.println(txt2.toUpperCase());
    }
}
