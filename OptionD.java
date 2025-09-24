import java.util.Arrays;

public class OptionD {
    /**Find the average of the array. 
     * Display how each element of the array differs from the average. 
     * For example, if the array is {2, 6, 9, 3, 5}, and the average is 5, 
     * then the differences from the average would be {-3, 1, 4, -2, 0}.
    */
    private static int findAverage(int[] arr){
        int sum = 0;
        for(int a:arr){
            sum+=a;
        }
        return sum/arr.length;
    }

    public static String displayDiff(int[] arr){
        int ave = findAverage(arr);
        int[] diff = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            diff[i]= arr[i]-ave;
        }
        return Arrays.toString(diff);
    }
}
