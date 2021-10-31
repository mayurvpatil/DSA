public class BinarySearch {

    /**
     * Use binary search when input is sorted in any order. Time Complexity :
     * O(logN) Space Complexity : O(1)
     */

    // return index of target else -1
    private static int search(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + ((end - start) / 2);
            // int mid = (start + end ) >>> 1; alternative

            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 6, 7, 14, 15, 53, 66 };
        System.out.println(search(array, 15));
        System.out.println(search(array, 54));

    }

}
