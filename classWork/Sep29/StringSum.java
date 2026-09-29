package Sep29;

import java.util.Scanner;

public class StringSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputarr = input.split(" ");
        int res = Integer.parseInt(inputarr[0]);
        for(int i=1;i<inputarr.length;i+=2){
            int temp = Integer.parseInt(inputarr[i+1]);
            switch(inputarr[i]){
                case "+":
                    res+=temp;
                    break;
                case "-":
                    res-=temp;
                    break;
                case "*":
                    res*=temp;
                    break;
                case "/":
                    res/=temp;
                    break;
                case "%":
                    res%=temp;
                    break;
                default:
                    System.out.println("Invalid");
                    return;
            }
        }
        System.out.println(res);
        sc.close();
    }
}   
