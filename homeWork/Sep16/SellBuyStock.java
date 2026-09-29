package Sep16;

import java.util.Scanner;

public class SellBuyStock {
    public static int maxProfit(int[] prices) {
        int minSoFar = prices[0];
        int res = 0;

        for (int i = 1; i < prices.length; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);
            res = Math.max(res, prices[i] - minSoFar);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
        sc.close();
    }
}
