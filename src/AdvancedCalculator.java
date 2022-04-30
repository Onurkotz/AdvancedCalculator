import java.util.Scanner;

public class AdvancedCalculator {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". number:");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result: " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers do you enter?:");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number:");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result: " + result);
    }

    static void multiply() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number:");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result: " + result);
    }

    static void divide() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers do you enter?:");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number:");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Divider cannot be 0");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result: " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number:");
        int base = scan.nextInt();
        System.out.print("Enter power value:");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result: " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result: " + result);
    }

    static void mode(){
        Scanner input = new Scanner(System.in);
        int number, divider, result;

        System.out.print("Enter number: ");
        number = input.nextInt();
        System.out.print("Enter divider: ");
        divider = input.nextInt();

        result = number % divider;
        System.out.println("Result: " + result);

    }

    static void rectangle(){
        Scanner input = new Scanner(System.in);

        int a, b, perimeter, area;

        System.out.print("Enter a line: ");
        a = input.nextInt();
        System.out.print("Enter b line: ");
        b = input.nextInt();

        perimeter = 2 * ( a + b );
        area = a * b;

        System.out.println("Result is below. \nPerimeter: " + perimeter + "\nArea: " + area);

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String menu = "1- Plus\n" +
                "2- Minus\n" +
                "3- Multiply\n" +
                "4- Divide\n" +
                "5- Power\n" +
                "6- Factorial\n" +
                "7- Mode\n" +
                "8- Area and Perimeter of Rectangle";

        int select;
        String line = "------------------------------------------";

        do {
            System.out.println(menu);
            System.out.print("Please choose what do you want to do:");
            select = input.nextInt();
            switch (select) {
                case 1:
                    plus();
                    System.out.println(line);
                    break;
                case 2:
                    minus();
                    System.out.println(line);
                    break;
                case 3:
                    multiply();
                    System.out.println(line);
                    break;
                case 4:
                    divide();
                    System.out.println(line);
                    break;
                case 5:
                    power();
                    System.out.println(line);
                    break;
                case 6:
                    factorial();
                    System.out.println(line);
                    break;
                case 7:
                    mode();
                    System.out.println(line);
                    break;
                case 8:
                    rectangle();
                    System.out.println(line);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid value! Please try again.");
            }
        } while (select != 0);

    }




}
