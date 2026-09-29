package Sep16;

import java.util.Scanner;

public class FristUniqueChar {
    public static int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            boolean occurs = false;
            for(int j=0;j<s.length();j++){
                if(i==j){
                    continue;
                }
                if(s.charAt(i)==s.charAt(j)){
                    occurs=true;
                    break;
                }
            }
            if(occurs){
                continue;
            }
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(firstUniqChar(s));
        sc.close();
    }
}
