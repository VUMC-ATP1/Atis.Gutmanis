package homework;

import java.util.Scanner;

public class HomeWorkTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x;
        x = 9;
        System.out.println("Is x bigger than 0? Answer: " + (x > 0));
        System.out.println("Is x less than 0? Answer: " + (x < 0));
        System.out.println("Is x higher than 5 and less or equal than 10? Answer: " + ((x > 5) && (x <= 10)));
        System.out.println("Is x less or equal than five and x is smaller than ten? Answer: " + (!(x <= 5) && (x < 10)));
        System.out.println("Is x equal to 0? And is it equal to 10? Answer: " + ((x == 0) && (x == 10)));
        System.out.println("Is x times x bigger than 10? Answer: " + ((x * x > 10)));

        System.out.println();
        System.out.println("Which number is seen on package?");
        int numb = scanner.nextInt();
        switch (numb) {
            case 1:
                System.out.println("Milk is valid until January");
                break;
            case 2:
                System.out.println("Milk is valid until February");
                break;
            case 3:
                System.out.println("Milk is valid until March");
                break;
            case 4:
                System.out.println("Milk is valid until April");
                break;
            case 5:
                System.out.println("Milk is valid until May");
                break;
            case 6:
                System.out.println("Milk is valid until June");
                break;
            case 7:
                System.out.println("Milk is valid until July");
                break;
            case 8:
                System.out.println("Milk is valid until August");
                break;
            case 9:
                System.out.println("Milk is valid until September");
                break;
            case 10:
                System.out.println("Milk is valid until October");
                break;
            case 11:
                System.out.println("Milk is valid until November");
                break;
            case 12:
                System.out.println("Milk is valid until December");
                break;
            default:
                System.out.println("Please check the number and try again.");

        }

        System.out.println();

        System.out.println("We will find the biggest number. Please insert first number:");
        int num1 = scanner.nextInt();
        System.out.println("Please enter second number:");
        int num2 = scanner.nextInt();
        System.out.println("Please enter third number");
        int num3 = scanner.nextInt();
        if (num1 > num2 && num1 > num3)
            System.out.println(num1 + " is the biggest number!");
        else if (num2 > num1 && num2 > num3)
            System.out.println(num2 + " is the biggest number!");
        else if (num3 > num1 && num3 > num2)
            System.out.println(num3 + " is the biggest number!");
        else System.out.println("Are those the same numbers?");

        System.out.println();

        System.out.println("Open your eyes. What color do you see?");
        String color = scanner.next();
        if (color.equals("red"))
            System.out.println("Slow down, son.");
        else if (color.equals("yellow"))
            System.out.println("Rev your engines!");
        else if (color.equals("green"))
            System.out.println("You better rum, son!");
        else if (color.equals("black"))
            System.out.println("Did you even open your eyes or are ya screwing with me, son?");
        else System.out.println("Please call an adult, you are not ready for traffic.");


        System.out.println();
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

        printBusinessCardTwo("Alise", 43514235, 1443);
        printBusinessCardTwo("Mareks", 4234324, 2432);

        int b = 20;
        int a = 10;
        int summa = sum(a, b);
        System.out.println("a + b = " + summa);
        System.out.println();

        double s = 3;
        double u = 4;
        double n = 5;
        double vid = average(s, u, n);
        System.out.println((vid));
    }

    public static void printBusinessCard() {
        System.out.println("Vizītkarte");
        System.out.println("############");
        System.out.println("Vārds: Kamambērs");
        System.out.println("Uzvārds: Sērs");
        System.out.println("Telefons: Nokia");
        System.out.println("Dzimšanas gads: 1563");
        System.out.println("############");


    }
        public static void printBusinessCardTwo (String name ,int phone, int year){
        System.out.println("Vizītkarte");
        System.out.println("############");
        System.out.println("Vārds: " + name);
        System.out.println("Telefons: " + phone);
        System.out.println("Dzimšanas gads: " + year);
        System.out.println("############");
    }
    public static int sum(int number1, int number2) {
        return number1 + number2;}

    public static double average(double num1, double num2, double num3) {
        return ((num1 + num2 + num3) / 3);
    }}
