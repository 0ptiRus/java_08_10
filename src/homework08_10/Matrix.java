package homework08_10;

import java.util.Scanner;
import java.util.Random;

public class Matrix 
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter columns: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                array[i][j] = random.nextInt(11);
            }
        }

        System.out.println("Base array:");
        printArray(array);

        System.out.print("Enter row to delete: ");
        int rowToDelete = scanner.nextInt();

        array = deleteRow(array, rowToDelete);
        
        System.out.println("Array after deletion:");
        printArray(array);
    }

    public static void printArray(int[][] array) 
    {
        for (int[] row : array) 
        {
            for (int elem : row) 
            {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static int[][] deleteRow(int[][] array, int rowToDelete) 
    {
        int[][] newArray = new int[array.length - 1][array[0].length];
        int newRow = 0;

        for (int i = 0; i < array.length; i++) 
        {
        	 for (int j = 0; j < array[0].length; j++) 
        	 {
        		 if(i != rowToDelete)
        		 {
        			 newArray[newRow][j] = array[i][j];        			 
        		 }
             }
            newRow++;
        }

        return newArray;
    }
}
