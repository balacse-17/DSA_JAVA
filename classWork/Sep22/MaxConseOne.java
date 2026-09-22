package classWork.Sep22;

public class MaxConseOne {
    public static void main(String[] args) {
        int[] arr = {1 ,1 ,1 ,1 ,1 ,1 ,1 ,1};
        boolean zero = false;
        int len = 0;
        int maxLen = 0;
        int left = 0;
        int right = 0;
        int index0 = 0;
        while(right<arr.length){
            if(arr[right]==0){
                if(zero){
                    len = len-(index0-left);
                    left = index0;
                    zero = false;
                    if(maxLen<len){
                        maxLen = len;
                    }
                }
                else{
                    zero = true;
                    len++;
                    right++;
                }
                index0 = right;
            }
            else{
                len++;
                right++;
            }
        }
        if(maxLen<len){
            maxLen = len;
        }
        System.out.println(maxLen);
    }
}
