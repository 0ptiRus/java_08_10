package homework08_10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ZodiacYear {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date of birth (Example: 05 december 1974): ");
        String input = scanner.nextLine();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        LocalDate birthDate = LocalDate.parse(input, formatter);

        String zodiac = getZodiacSign(birthDate.getDayOfMonth(), birthDate.getMonthValue());
        String japaneseYear = getJapaneseYear(birthDate.getYear());

        System.out.println("Sign: " + zodiac);
        System.out.println("Year of the " + japaneseYear);
    }

    public static String getZodiacSign(int day, int month) 
    {
        String[] zodiacSigns = {"Capricorn", "Aquarius", "Pisces", "Aries", "Taurus", "Gemini", 
                                "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius"};
        int[] zodiacEndDays = {19, 18, 20, 19, 20, 21, 22, 22, 22, 22, 21, 21};

        if (day <= zodiacEndDays[month - 1]) {
            return zodiacSigns[month - 1];
        } else {
            return zodiacSigns[month];
        }
    }

    public static String getJapaneseYear(int year) 
    {
        String[] japaneseZodiac = {"Rat", "Bull", "Tiger", "Rabbit", "Dragon", "Snake",
                                   "Horse", "Sheep", "Monkey", "Rooster", "Dog", "Pig"};
        return japaneseZodiac[year % 12];
    }
}
