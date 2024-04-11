package com.pluralsight;
import java.util.Scanner;

public class MathApp
{
    public static void main(String[] args)
    {
//        int Value1 = 10;
//        int Value2 = 20;
//
//        int Total = Value1 + Value2;
//        System.out.print("The answer is " + Total);

        Scanner scanner = new Scanner(System.in);


        // Bob And Gary Salary:

        System.out.println("Bob Enter your salary: $");
        int BobSalary = scanner.nextInt();

        System.out.println("Gary Enter you salary: $");
        int GarySalary = scanner.nextInt();

        //Math.max(BobSalary, GarySalary);

        if (GarySalary > BobSalary)
        {
            int HowMuch = GarySalary - BobSalary;
            System.out.println("Gary gets payed $" + HowMuch + " more dollars than Bob");
        }
        else if(BobSalary > GarySalary)
        {
            int HowMuch = BobSalary - GarySalary;
            System.out.println("Bob gets payed $" + HowMuch + " more dollars than Gary");
        }
        else if (BobSalary == GarySalary)
        {
            System.out.println("They get payed the same amount!");
        }


        //Car VS Truck Price

        System.out.println("Enter the Car Price: ");
        int CarPrice = scanner.nextInt();

        System.out.println("Enter the Truck Price: ");
        int TruckPrice = scanner.nextInt();

        //Math.min(CarPrice, TruckPrice);

        if (TruckPrice > CarPrice)
        {
            int MostExpencive = TruckPrice - CarPrice;
            System.out.println("The truck is $" + MostExpencive + " more expensive than the car");
        }
        else
        {
            int MostExpencive =  CarPrice - TruckPrice;
            System.out.println("The car is $" + MostExpencive + " more expensive than the truck");
        }


        //Circle Radius:

        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of the circle is: " + area);



        //Square Root:

        System.out.println("Enter the number which you would like to find the square root of: ");
        double FindRoot = scanner.nextInt();

        double squareRoot = Math.sqrt(FindRoot);

        System.out.println("The square root of " + FindRoot + " is: " + squareRoot);



        //Distance Between Points:

        System.out.println("Enter the first 2 points (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter the other coordinates (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double Distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.println("The distance between the coordinates is: " + Distance);
    }



}


