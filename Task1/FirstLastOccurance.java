package Task1;
import java.util.Scanner;

public class FirstLastOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = sc.nextInt();
        int[] arr = new int[n];
        boolean occurs = false;
        int index = -1;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]==val){
                if(!occurs){
                    occurs = true;
                    System.out.print(i+" ");
                }
                index = i;
            }
        }
        if(!occurs){
            System.out.println(index+" "+index);
            sc.close();
            return;
        }
        System.out.print(index);
        sc.close();
    }
}
