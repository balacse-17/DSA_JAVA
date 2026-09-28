package classWork.Sep28;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i=0;i<input1.length();i++){
            map1.put(input1.charAt(i),map1.getOrDefault(input1.charAt(i),0)+1);
        }
        for(int i=0;i<input2.length();i++){
            char ch = input2.charAt(i);
            if(map1.containsKey(ch)){
                map1.put(ch,map1.get(ch)-1);
            }
            else{
                System.out.println("Not a anagram");
                sc.close();
                return;
            }
        }
        for (int x : map1.values()){
            if(x!=0){
                System.out.println("Not a anagram");
                sc.close();
                return;
            }
        }
        System.out.println("Anagram");
        sc.close();
    }
}