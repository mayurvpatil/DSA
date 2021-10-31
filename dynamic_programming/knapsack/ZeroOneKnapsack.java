public class ZeroOneKnapsack {

    /**
     * Knapsack recursive approach, to find maximum profit.
     */

    private static int knapsack(int[] weights, int[] profits, int capacity, int currentItem) {

        if (currentItem < 0 || capacity <= 0)
            return 0;

        if (capacity >= weights[currentItem]) {

            int included = profits[currentItem] + knapsack(weights, profits, capacity - weights[currentItem], currentItem - 1);
            int excluded = knapsack(weights, profits, capacity, currentItem - 1);

            return Math.max(included, excluded);
        }

        return knapsack(weights, profits, capacity, currentItem - 1); // excluded
    }

    public static void main(String[] args) {

        int[] profits = { 1, 6, 10, 16 };
        int[] weights = { 1, 2, 3, 5 };
        int capacity = 7;

        int maxProfit = knapsack(weights, profits, capacity, profits.length - 1);
        System.out.println("Total knapsack profit :" + maxProfit);

        capacity = 6;
        maxProfit = knapsack(weights, profits, capacity, profits.length - 1);
        System.out.println("Total knapsack profit : " + maxProfit);

    }

}
