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
        
        if ( selection == 6){
            Scanner DUI = new Scanner(System.in);
            System.out.println("1. Metric System 2. Imperial System ");
            System.out.print("Select your measurement system:");
            int SUI = DUI.nextInt();

            if(SUI == 1){
                System.out.println("1. MM -> CM 2. MM -> M 3. MM -> KM 4. CM -> MM 5. CM -> M 6. CM -> KM");
                System.out.println("7. M -> MM 8. M -> CM 9. M -> KM 10. KM -> M 11. KM -> CM 12. KM -> MM");
                System.out.print("Enter the conversion you would like to use:");
                int MUI = DUI.nextInt();

                if(MUI == 1){
                    ConvertDistance(false,10,"MM","CM");
                }
                if(MUI == 2){
                    ConvertDistance(false,1000,"MM","Meters");
                }
                if(MUI == 3){
                    ConvertDistance(false,1e+6,"MM","KM");
                }
                if(MUI == 4){
                    ConvertDistance(true,10,"CM","MM");
                }
                if(MUI == 5){
                    ConvertDistance(false,100,"CM","Meters");
                }
                if(MUI == 6){
                    ConvertDistance(false,100000,"CM","KM");
                }
                if(MUI == 7){
                    ConvertDistance(true,1000,"Meters","MM");
                }
                if(MUI == 8){
                    ConvertDistance(true,100,"Meters","CM");
                }
                if(MUI == 9){
                    ConvertDistance(false,1000,"Meters","KM");
                }
                if(MUI == 10){
                    ConvertDistance(true,1000,"KM","Meters");
                }
                if(MUI == 11){
                    ConvertDistance(true,100000,"KM","CM");
                }
                if(MUI == 12){
                    ConvertDistance(true,1e+6,"KM","MM");
                }
            }

            if(SUI == 2){
                System.out.println("1. I -> F 2. I -> Y 3. I -> M 4. F -> I 5. F -> Y 6. F -> M");
                System.out.println("7. Y -> I 8. Y -> F  9. Y -> M 10. M -> I 11. M -> F 12. M -> Y");
                System.out.print("Enter the conversion you would like to use: ");
                int IUI = DUI.nextInt();

                if(IUI == 1){
                    ConvertDistance(false,12,"Inches","Foot");
                }
                if(IUI == 2){
                    ConvertDistance(false,36,"Inches","Yards");
                }
                if(IUI == 3){
                    ConvertDistance(false,63360,"Inches","Miles");
                }
                if(IUI == 4){
                    ConvertDistance(true,12,"Foot","Inches");
                }
                if(IUI == 5){
                    ConvertDistance(false,3,"Foot","Yards");
                }
                if(IUI == 6){
                    ConvertDistance(false,5280,"Foot","Miles");
                }
                if(IUI == 7){
                    ConvertDistance(true,36,"Yards","Inches");
                }
                if(IUI == 8){
                    ConvertDistance(true,3,"Yards","Foot");
                }
                if(IUI == 9){
                    ConvertDistance(false,1760,"Yards","Miles");
                }
                if(IUI == 10){
                    ConvertDistance(true,63360,"Miles","Inches");
                }
                if(IUI == 11){
                    ConvertDistance(true,5280,"Miles","Foot");
                }
                if(IUI == 12){
                    ConvertDistance(true,1760,"Miles","Yards");
                }
            }
        }
    }
}
