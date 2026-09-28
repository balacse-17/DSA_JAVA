package classWork.Sep23;
// Input:
// 5
// 100 200 150 300 250

import java.util.Arrays;

// Output:
// 100 300 450 750 1000
public class CummulativeSales {
    public static void main(String[] args) {
        int[] arr = {100, 200, 150, 300, 250};
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<=i;j++){
                sum+=arr[j];
            }
            res[i] = sum;
        }
        System.out.println("\n"+Arrays.toString(res));
    }
}
