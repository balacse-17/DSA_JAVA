package Task1;
//Time Complexity : O(n)
import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputarr = input.split(" ");
        int[] arr = new int[inputarr.length];
        int pre=0,abs=0;
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(inputarr[i]);
            if(arr[i]==1){
                pre++;
            }
            else{
                abs++;
            }
        }
        double att = (double)pre/(pre+abs)*100;
        System.out.printf("Present: %d,Absent: %d,Att %.2f%%",pre,abs,att);
        sc.close();
    }
}


