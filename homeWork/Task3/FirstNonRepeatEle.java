package Task3;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatEle {
    
    public static int firstNonRepeating(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map.toString());
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==1){
                return  e.getKey();
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {4 ,-8 ,1 ,-4 ,-3 ,-8 ,-3 ,-10 ,3 ,-3 ,10};
        System.out.println(firstNonRepeating(arr));
    }
}

