import java.util.*;

public class calculatorProject {
    public static void main(String[] args) {
        Scanner userInput1 = new Scanner(System.in);
        System.out.println("___________________________");
        System.out.println("| 1) Pythagorean Theorem  |");
        System.out.println("| 2) Discounting          |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|_________________________|");
        System.out.print("Select what you would like to calculate: ");
        int selection = userInput1.nextInt();

        if (selection == 1) {
            int sideOne,sideTwo;
            Scanner sides = new Scanner (System.in);
            System.out.println("To find the area of the Hypotenuse, enter the area of the 2 other sides of the triangle.");
            System.out.print("Area of side 1: ");
            sideOne = sides.nextInt();
            System.out.print("Area of side 2: ");
            sideTwo = sides.nextInt();
            System.out.print(Math.pow(sideOne, 2) + Math.pow(sideTwo, 2));
        }

        if (selection == 2) {
            double total,discountPercentage,s,endPrice;
            Scanner discount = new Scanner (System.in);
            System.out.print("Enter the full price of item: ");
            total = discount.nextDouble();
            System.out.print("Enter discount percentage: ");
            discountPercentage = discount.nextDouble();
            s = 100-discountPercentage;
            endPrice = (s*total)/100;
            System.out.print("Total after discount: "+ endPrice);

        }
    }
}
