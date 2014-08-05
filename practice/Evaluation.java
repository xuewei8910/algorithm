import java.lang.Integer;
import java.util.Stack;
import java.lang.String;

class Evaluation{
    public int evaluate(String s){
        Stack<String> st = new Stack<String>();
        String tmp = "";
        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i) != '*' && s.charAt(i) != '+'){
                tmp += s.charAt(i);
            }else {
                if (!st.isEmpty() && st.peek().equals('*')){
                    st.pop();
                    tmp = ""+(Integer.parseInt(tmp)*Integer.parseInt(st.pop()));
                }
                st.push(tmp);
                st.push(""+s.charAt(i));
            }
        }

        int result = 0;
        while (!st.isEmpty()){
            String t = st.pop();
            if (t.equals("+")){
                continue;
            }else {
                result += Integer.parseInt(t);
            }
        }
        return result;
    }
}