package Sep23;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,4 ,5 ,6 ,7 ,10 ,15};
        int t = 10;
        int left = 0;
        int right = arr.length;
        int diff = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;
        while(left<right){
            diff = arr[right]+arr[left] - t;
            if(minDiff<diff){
                break;
            }
            else{
                
            }
        }
    }
}
