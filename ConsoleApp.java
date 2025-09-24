import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class ConsoleApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of your array: ");
        int size = in.nextInt();
        int[] arr = arrayCreator(size);

        System.out.println("1- Find the maximum and minimum");
        System.out.println("2- Find the average");
        System.out.println("3- Find the sum of odd-indexed numbers");
        System.out.println("4- Find the sum of even-indexed numbers");
        System.out.println("5- Exit");
        System.out.println("Enter your choice");
        int choice = in.nextInt();

        while(choice != 5){
            System.out.println("1- Find the maximum and minimum");
            System.out.println("2- Find the average");
            System.out.println("3- Find the sum of odd-indexed numbers");
            System.out.println("4- Find the sum of even-indexed numbers");
            System.out.println("5- Exit");
            System.out.println("Enter your choice");
            choice = in.nextInt();
            
        }
    }
    public static int[] arrayCreator( int arraySize ){
        Random joker = new Random();

        int[] outputArray = new int[arraySize];

        for( int i = 0; i < arraySize; i++){
            
            outputArray[i] = joker.nextInt(101);
        }

        return outputArray;
    }
}