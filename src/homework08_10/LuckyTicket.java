package homework08_10;

import java.util.Scanner;

public class LuckyTicket 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a six digit number: ");
        int number = scanner.nextInt();

        if (isLuckyTicket(number)) 
        {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isLuckyTicket(int number) 
    {
        int firstPart = number / 1000;
        int secondPart = number % 1000;

        return sumOfDigits(firstPart) == sumOfDigits(secondPart);
    }

    public static int sumOfDigits(int number) 
    {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
