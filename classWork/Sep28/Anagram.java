package Sep28;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        int[] count = new int[52];
        for(int i=0;i<input1.length();i++){
            char ch = input1.charAt(i);
            if(ch>'a' && ch<'z'){
                count[ch-'a']++;
            }
            else{
                count[ch-'A']++;
            }
        }
        for(int i=0;i<input2.length();i++){
            char ch = input2.charAt(i);
            if(ch>'a' && ch<'z'){
                count[ch-'a']--;
                if(count[ch-'a']<0){
                    System.out.println("Not an anagram");
                    sc.close();
                    return;
                }
            }
            else{
                count[ch-'A']--;
                if(count[ch-'A']<0){
                    System.out.println("Not an anagram");
                    sc.close();
                    return;
                }
            }
        }
        for(int i=0;i<52;i++){
            if(count[i]!=0){
                System.out.println("Not an anagram");
                sc.close();
                return;
            }
        }
        System.out.println("Anagram");
        sc.close();
    }
}