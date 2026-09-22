package Task3;

import java.util.ArrayList;

import java.util.Scanner;

public class DeleteFirstOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        String input = sc.nextLine();
        String[] inputArr = input.split(" ");
        int n = sc.nextInt();
        boolean occurs = true;
        for(int i=0;i<inputArr.length;i++){
            if(Integer.parseInt(inputArr[i])==n && occurs){
                occurs = false;
                continue;
            }
            arr.add(Integer.parseInt(inputArr[i]));
        }
        System.out.println(arr);
        sc.close();
    }
}
