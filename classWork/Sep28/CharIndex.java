package classWork.Sep28;

import java.util.Scanner;

class CharIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for(int i=0;i<input.length();i++){
            System.out.println(input.charAt(i)+" "+i);
        }
        sc.close();
    }
}
