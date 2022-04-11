import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner userInput1 = new Scanner(System.in);
        System.out.println("___________________________");
        System.out.println("| 1) Pythagorean Theorem  |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|_________________________|");
        System.out.print("Select what you would like to calculate: ");
        int selection = userInput1.nextInt();

        if (selection == 1) {
            Scanner sides = new Scanner (System.in);
            System.out.println("To find the area of the Hypotenuse, enter the area of the 2 other sides of the triangle.");
            System.out.print("Area of side 1: ");
            int sideOne = sides.nextInt();
            System.out.print("Area of side 2: ");
            int sideTwo = sides.nextInt();
            System.out.print(Math.pow(sideOne, 2) + Math.pow(sideTwo, 2));
        }

        else {
            System.out.print("Bye");
        }
    }
}