package classWork.Sep22;

import java.util.HashSet;

public class LongSubStr {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        int left = 0;
        int len = 0;
        int right = 0;
        int maxLen = 0;
        while(right<n){
            if(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
                if(maxLen<len){
                    maxLen = len;
                }
                len--;
            }
            else{
                set.add(s.charAt(right));
                right++;
                len++;
            }
        }
        if(maxLen<len){
            maxLen = len;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcdd"));
    }
}
