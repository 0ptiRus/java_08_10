package homework08_10;

public class ArmstrongNumbers 
{
    public static void main(String[] args) 
    {
        for (int i = 0; i <= 10000000; i++) 
        {
            if (isArmstrongNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrongNumber(int number) 
    {
        String numStr = String.valueOf(number);
        int length = numStr.length();
        int sum = 0;
        int temp = number;

        while (temp > 0) 
        {
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            temp /= 10;
        }

        return sum == number;
    }
}
