package Task2;
import java.util.*;

public class ReverseSinglePointer{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int i=0;
        while(i<n/2){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}