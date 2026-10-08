package sep15;

import java.util.HashSet;

public class ContainsDuplecate {
    public static void containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                System.out.println("There is a duplicate element"); // 10,20,30
                return;
            }
            set.add(nums[i]);
        }
        System.out.println("There is no duplicate elements");
        return;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,10,40};
        containsDuplicate(arr);
    }
}
