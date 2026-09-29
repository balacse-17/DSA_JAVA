package Sep29;

import java.util.Scanner;

public class ReverseString {
    public static void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        reverseString(arr);
        sc.close();
    }
}
