package Task1;

import java.util.Scanner;

public class UniqueId {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputarr = input.split(" ");
        int[] arr = new int[inputarr.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(inputarr[i]);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("NO");
                    sc.close();
                    return;
                }
            }
        }
        System.out.println("YES");
        sc.close();
    }
}
