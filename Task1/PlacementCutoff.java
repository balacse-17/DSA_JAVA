package Task1;
import java.util.Scanner;
//Time Complexity : O(n)
public class PlacementCutoff{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[2];
        for(int i=0;i<2;i++){
            input[i] = sc.nextInt();
        }
        int[] arr = new int[input[0]];
        int count = 0;
        for(int i=0;i<input[0];i++){
            arr[i] = sc.nextInt();
            if(arr[i]>=input[1]){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}