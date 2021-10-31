public class Floor {

    /**
     * return target index if present else index of smallest greater number
     * available in array.
     */

    private static int findFloor(int[] array, int target) {

        int start = 0;
        int end = array.length - 1;

        if (target < array[0]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (array[mid] == target)
                return mid;
            else if (target < array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return end;
    }

    public static void main(String[] args) {
        int array[] = { 5, 6, 9, 12, 14, 15, 19, 20, 44, 56, 104 };

        System.out.println(findFloor(array, 5));
        System.out.println(findFloor(array, 17));
        System.out.println(findFloor(array, 1));
        System.out.println(findFloor(array, 120));
    }

}
