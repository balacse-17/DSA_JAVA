package Sep28;

import java.util.HashSet;

public class RemoveDuplicate {
    
    String removeDuplicates(String s) {
        HashSet<Character> set = new HashSet<>();
        String res = new String();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                continue;
            }
            set.add(ch);
            res+=ch;
        }
        return res;
    
}

}
