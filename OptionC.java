public class OptionC {
    /**
    * Returns an array which has the minimum element in its first position and
    * the maximum element in its second position
    */
    public static int[] callOptionC(int[] arr) {
        int minEl = findMin(arr);
        int maxEl = findMax(arr);

        int[] result = {minEl, maxEl};
        return result;
    }

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
