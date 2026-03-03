import java.util.*;
// day04
//Valid Parentheses
//https://leetcode.com/problems/valid-parentheses/description/

public class Stack_day04_q1 {
      public  static boolean isValid(String s) {
        Stack<Character> store = new Stack<>();
        String leftOpen = "([{";
        String RightClose = ")}]";
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if(leftOpen.indexOf(ch) != -1){
                store.push(ch);
            }else if(store.isEmpty() && RightClose.indexOf(ch) != -1){
                return false; 
            }
            else{
                char lastOccur = store.peek();
                if((lastOccur == '('  && ch == ')') || (lastOccur == '{' && ch == '}') ||               (lastOccur == '[' && ch == ']')){ 
                    store.pop();
                }else{
                    return false; 
                }
            }
        }
        return store.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean valid = isValid(s);
        System.out.println(valid);  
    }
}

    
