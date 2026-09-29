package Sep28;

public class ReplaceConseEle {
    public String removeDuplicates(String s) {
        char prev = s.charAt(0);
        StringBuilder res = new StringBuilder();
        res.append(prev);
        for(int i=1;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==prev){
                continue;
            }
            res.append(ch);
            prev=ch;
        }
        return res.toString();
    }
}
