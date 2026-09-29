package Sep16;

import java.util.HashSet;
import java.util.Scanner;

public class FirstRepChar {
    
    public static String firstRepChar(String s) {
        // code here
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                return String.valueOf(ch);
            }
            set.add(ch);
        }
        return "-1";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(firstRepChar(s));
        sc.close();
    }
}
