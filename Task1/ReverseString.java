package Task1;
import java.util.Scanner;
//Time Complexity : O(n)
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] arr = input.toCharArray();
        int l = 0;
        int r = input.length()-1;
        while(l<r){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        input = String.valueOf(arr);
        System.out.println(arr);
        sc.close();
    }
}
