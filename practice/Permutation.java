import java.lang.String;
import java.util.ArrayList;
import java.lang.String;
import java.util.Arrays;

class Permutation{
    public ArrayList<String> permute(String s){
        char[] c = s.toCharArray();
        Arrays.sort(c);
        ArrayList<String> result = new ArrayList<String>();
        permuteR(c,new boolean[c.length],"",result);

        return result;
    }

    public void permuteR(char[] c, boolean[] m, String current,  ArrayList<String> r){
        if (current.length() == c.length){
            r.add(current);
        }else {
            for (int i = 0; i<c.length; i++){
                if (!m[i]) {
                    if (i>0 && c[i] == c[i-1] && !m[i-1]){
                        continue;
                    }
                    current += c[i];
                    m[i] = true;
                    permuteR(c, m, current, r);
                    current = current.substring(0, current.length() - 1);
                    m[i] = false;
                }
            }
        }
    }
}