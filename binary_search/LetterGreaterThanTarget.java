public class LetterGreaterThanTarget {

    /**
     * Leetcode : 744. Find Smallest Letter Greater Than Target
     * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
     * 
     * Given a characters array letters that is sorted in non-decreasing order and a
     * character target, return the smallest character in the array that is larger
     * than target. Note that the letters wrap around.
     */

    // Input: letters = ["c","f","j"], target = "a" Output: "c"
    // Input: letters = ["c","f","j"], target = "j" Output: "c"

    private static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }

    public static void main(String[] args) {

        System.out.println(nextGreatestLetter(new char[] { 'c', 'f', 'j' }, 'a'));
        System.out.println(nextGreatestLetter(new char[] { 'c', 'f', 'j' }, 'j'));
        System.out.println(nextGreatestLetter(new char[] { 'c', 'f', 'j' }, 'g'));
    }
}
