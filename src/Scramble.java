import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Scramble {

    static String scrambleWord(String word){
        String ans = "";
        for (int i = 0; i < word.length()-1; i++){
            if(word.charAt(i)=='A' && word.charAt(i+1)!='A'){
                ans+=""+word.charAt(i+1)+word.charAt(i);
                i++;
            }else{
                ans+=(char)word.charAt(i);
            }
        }
        if(ans.length()<word.length()){
            ans+=word.charAt(word.length()-1);
        }
        return ans;
    }

    static List<String> scrambleOrRemove(List<String> words){
        for (int i = words.size()-1; i >= 0; i--){
            String s = scrambleWord(words.get(i));
            System.out.println(s);
            if(s.equals(words.get(i))){
                words.remove(i);
            }else{
                words.set(i, s);
            }
        }
        return words;
    }
}
