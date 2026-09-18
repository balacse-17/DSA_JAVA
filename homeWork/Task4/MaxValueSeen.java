package Task4;

import java.util.Scanner;

public class MaxValueSeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputarr = input.split(" ");
        int[] arr = new int[inputarr.length];
        int max = arr[0];
        for(int i=0;i<inputarr.length;i++){
            arr[i] = Integer.parseInt(inputarr[i]);
            if(arr[i]>max){
                max = arr[i];
            }
            System.out.print(max+" ");
        }
        sc.close();
    }
}
