public class OptionC {
    // returns the minimum and maximum found in an array

    private static int findMax(int[] arr) {
        int max = -1;

        for ( int val : arr ) {
            max = Math.max(val, max);
        }

        return max;
    }

    private static int findMin(int[] arr) {
        int min = 101;

        for ( int val : arr ) {
            min = Math.min(val, min);
        }

        return min;
    }
}
