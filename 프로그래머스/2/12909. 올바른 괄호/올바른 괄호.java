import java.util.*;

class Solution {
    boolean solution(String s) {
        Deque<Character> deque =  new ArrayDeque<>();
        for(int i=0;  i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='('){
                deque.push('(');
            } else{
                if (deque.isEmpty()) {
                    return false;
                }
                deque.pop();
            }
        }
        if(deque.isEmpty()){
            return true;
        } else{
            return false;
        }
    }
}