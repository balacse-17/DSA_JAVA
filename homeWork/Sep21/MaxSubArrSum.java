package Sep21;


class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        
        
        int sum=0;
        for(int j=0;j<k;j++){
            sum+=arr[j];
        }
        int maxSum=sum;
        for(int i=k;i<arr.length;i++){
            sum-=arr[i-k];
            sum+=arr[i];
            if(maxSum<sum){
                maxSum=sum;
            }
        }
        return maxSum;
    }
}

public class MaxSubArrSum {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {10,20,30,40,50};
        int n=2;
        System.out.println(s.maxSubarraySum(arr,n));        
    }
    
}
