package homework08_10;

import java.util.Arrays;
import java.util.Random;

public class WorkingWithArray 
{
	 public static void main(String[] args) 
	 {
	        int[] array = new int[10];
	        Random random = new Random();
	        
	        for (int i = 0; i < array.length; i++) {
	            array[i] = random.nextInt(21) - 10;
	        }

	        System.out.println("Base array: " + Arrays.toString(array));

	        double average = Arrays.stream(array).average().orElse(0.0);
	        System.out.println("Average: " + average);

	        int[] lessThanAverage = Arrays.stream(array).filter(x -> x < average).toArray();
	        System.out.println("Array with elements below average: " + Arrays.toString(lessThanAverage));

	        Arrays.sort(array);
	        System.out.println("Sorted array: " + Arrays.toString(array));
	    }
}
