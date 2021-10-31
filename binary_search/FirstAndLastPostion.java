import java.util.Arrays;

public class FirstAndLastPostion {

    /**
     * 
     */

    public static int[] searchRange(int[] nums, int target) {

        int start = binarySearch(nums, target, true);
        if (start == -1) {
            return new int[] { -1, -1 };
        }
        return new int[] { start, binarySearch(nums, target, false) };
    }

    private static int binarySearch(int[] nums, int target, boolean isFirst) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + ((end - start) / 2);
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // found potential answer
                ans = mid;
                if (isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] array = { 5, 7, 7, 8, 8, 8, 8, 8, 8, 10 };
        System.out.println(Arrays.toString(searchRange(array, 8)));

    }

}
