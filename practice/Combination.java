import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
class Combination {
    public ArrayList<String> combine(String s){
        char[] c = s.toCharArray();
        ArrayList<String> result = new ArrayList<String>();
        result.add("");
        for (int i = 0; i<c.length; i++){
            ArrayList<String> tmp = new ArrayList<String>(result);
            for (String t:tmp){
                t += c[i];
                result.add(t);
            }
        }

        return result;
    }
}
