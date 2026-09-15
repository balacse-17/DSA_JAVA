package Task1;
import java.util.Scanner;
//Time complexity : O(n)
public class ExamScore{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }   
        // display + average + Max + Min
        int max = arr[0];
        int min = arr[0];
        double avg = 0;
        System.out.println("Scores:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min =arr[i];
            }
            if(i%4==3){
                System.out.println();
            }
            avg+=arr[i];
        }
        avg/=n;
        System.out.println("\nAverage: "+avg);
        System.out.println("Lowest Score: "+min);
        System.out.println("Highest Score: "+max);
        System.out.println("\nScore \tDeviation");
        double sd=0;
        for(int i=0;i<n;i++){
            System.out.printf("%-5d \t %.2f %n",arr[i],arr[i]-avg);
            sd+=Math.pow((arr[i]-avg),2);
        }
        sd/=n;
        sd = Math.pow(sd,0.5);
        System.out.printf("%n%nStandard Deviation: %.2f",sd);
        int count=0;
        for(int i=0;i<n;i++){
            if(sd>=(arr[i]-avg)){
                count++;
            }
        }
        System.out.println("\n\nScores within one standard deviation: "+count);
        sc.close();
    }
}