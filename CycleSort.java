import java.util.Arrays;

public class CycleSort {

  /*
   * when input is in range 0 - N or 1 - N, use this algorithm to sort. time
   * complexity : O(n) space complexity : O(n)
   * 
   */

  private static void sort(int[] arr) {
    int i = 0;

    while (i < arr.length) {
      int n = arr[i] - 1;
      if (arr[n] != arr[i]) {
        swap(arr, n, i);
      } else {
        i++;
      }

    }
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

  }

  public static void main(String[] args) {

    int array[] = new int[] { 4, 2, 5, 1, 3 };

    System.out.println("Before sort : " + Arrays.toString(array));
    sort(array);
    System.out.println("After sort : " + Arrays.toString(array));

  }

}
