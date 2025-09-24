import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class ConsoleApp {
    public static void main(String[] args) {
        int minArr,  maxArr;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of your array: ");
        int size = in.nextInt();
        int[] arr = arrayCreator(size);
        System.out.println(Arrays.toString(arr));

        System.out.println("1- Find the maximum and minimum");
        System.out.println("2- Find the difference betweeen elements and average");
        System.out.println("3- Find the sum of even-indexed numbers");
        System.out.println("4- Find the sum of odd-indexed numbers");
        System.out.println("5- Exit");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        while(choice != 5){
            if(choice == 1){
                minArr = OptionC.callOptionC(arr)[0];
                maxArr = OptionC.callOptionC(arr)[1];
                System.out.println("Maximum element of your array: "  + maxArr);
                System.out.println("Minimum element of your array: " + minArr);
            }else if(choice == 2) {
                System.out.println(Arrays.toString(arr));
                System.out.println(OptionD.displayDiff(arr));
            } else if(choice == 3){
                System.out.println("Sum of even-indexed numbers: " + OptionE.sumOfEvens(arr));
            }else if(choice == 4){
                System.out.println("Sum of odd-indexed numbers: " + OptionE.sumOfOdds(arr));
            }
            System.out.println("1- Find the maximum and minimum");
            System.out.println("2- Find the average");
            System.out.println("3- Find the sum of even-indexed numbers");
            System.out.println("4- Find the sum of odd-indexed numbers");
            System.out.println("5- Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();
        }
        System.out.println("Goodbye:)");
        in.close();
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