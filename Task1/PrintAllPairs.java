package Task1;
import java.util.Scanner;
//Time Complexity : O(n^2)
public class PrintAllPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.printf("(%d,%d)%n",arr[i],arr[j]);
            }
        }
        sc.close();
    }
}
