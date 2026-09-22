package Sep21;

class Solution {
    public int[] prefixAvg(int[] arr) {
        // code here
        int count =0;
        int sum=0;
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            count++;
            res[i] = sum/count;
        }
        return res;
    }
}

class AvgOfPrefix{
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        Solution s = new Solution();
        System.out.println(s.prefixAvg(arr));
    }
}