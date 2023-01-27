package CP_package;

import java.util.Stack;

public class duplicate_parenthesis {
    public static boolean contain_duplicate_parenthesis(String str){
        Stack<Character> st=new Stack<>();
        for (int i=0;i<str.length();i++){
            char curr_char=str.charAt(i);
            if (curr_char!=')'){
                st.push(curr_char);
            }
            else {
                int removeElementCount=0;
                char top=st.pop();
                while (top!='('){
                    top=st.pop();
                    removeElementCount++;
                }
                if(removeElementCount<1){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
