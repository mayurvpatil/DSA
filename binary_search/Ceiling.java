public class Ceiling {

    /**
     * 
     * return target index if present else return next greater number index present
     * in array.
     */

    private static int findCeiling(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        if (target > arr[arr.length - 1])
            return -1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (target == arr[mid])
                return mid;
            else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 7, 9, 21, 53, 66, 78, 122 };

        System.out.println(findCeiling(array, 200));
    }
}
