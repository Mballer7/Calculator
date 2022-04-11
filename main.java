import java.util.*;

public class calculatorProject {
    public static void main(String[] args) {
        Scanner userInput1 = new Scanner(System.in);
        System.out.println("______CALCULATOR MENU______");
        System.out.println("| 1) Pythagorean Theorem  |");
        System.out.println("| 2) Discounting          |");
        System.out.println("| 3) Price Conversion     |");
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
        
        if ( selection == 3){
                double u = 0.79;
                double e = 0.73;
                double p = 0.61;
                double a = 1.07;
                double b = 3.73;
                Scanner UI = new Scanner(System.in);
                System.out.println("1.USD 2.EUROS 3.Pounds 4.Australian 5.Brazilian Real");
                System.out.println("What do you want to convert from CAD?");
                int conv = UI.nextInt();
                System.out.println("How much CAD do you want to convert?");
                double amount = UI.nextInt();
                if (conv == 1){
                    System.out.println(amount + " CAD is " +  amount*u + " USD");
                }
                if (conv == 2){
                    System.out.println(amount + " CAD is " +  amount*e + " Euros");
                }
                if (conv == 3){
                    System.out.println(amount + " CAD is " +  amount*p + " Pounds");
                }
                if (conv == 4){
                    System.out.println(amount + " CAD is " +  amount*a + " AUS");
                }
                if (conv == 5){
                    System.out.println(amount + " CAD is " +  amount*b + " Reals");
                }
        }
    }
}
