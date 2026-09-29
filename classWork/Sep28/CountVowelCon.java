package Sep28;

import java.util.Scanner;

public class CountVowelCon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vowel = 0;
        int con = 0;
        String input =  sc.nextLine();
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ||
            ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
                vowel++;
            }
            else{
                con++;
            }
        }
        System.out.println("Vowel: "+vowel+"\nConsonants: "+con);
        sc.close();
    }
}
