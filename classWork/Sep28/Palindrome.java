package Sep28;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String rev = new String();
        for(int i=input.length()-1;i>=0;i--){
            rev+=input.charAt(i);
        }
        if(input.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        sc.close();
    }
}
