public class OprionE {
    public static int sumOfEvens(int[] arr){
        int result = 0;
        for(int i = 0; i < arr.length; i +=2){
            result += arr[i];
        }
        return result;
    }
    public static int sumOfOdds(int[] arr){
        int result = 0;
        for(int i = 1; i < arr.length; i +=2){
            result += arr[i];
        }
        return result;
    }
}