import java.util.Arrays;
import java.util.Random;
public class ConsoleApp {
    public static void main(String[] args) {
        
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