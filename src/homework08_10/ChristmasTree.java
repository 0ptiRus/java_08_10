package homework08_10;

import java.util.Scanner;

public class ChristmasTree 
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount of tiers: ");
        int tiers = scanner.nextInt();
        System.out.print("Enter the height of the first tier: ");
        int height = scanner.nextInt();

        drawTree(tiers, height);
    }

    public static void drawTree(int tiers, int initialHeight) 
    {
        int width = 1;

        for (int tier = 0; tier < tiers; tier++) {
            for (int row = 0; row < initialHeight + tier; row++) {
                int spaces = (initialHeight + tiers - 1) - row;
                printChars(' ', spaces);
                printChars('*', width);
                System.out.println();
                width += 2;
            }
        }
    }

    public static void printChars(char ch, int count) 
    {
        for (int i = 0; i < count; i++) {
            System.out.print(ch);
        }
    }
}
