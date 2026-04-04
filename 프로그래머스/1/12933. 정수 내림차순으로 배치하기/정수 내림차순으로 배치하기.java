import java.util.*;
class Solution {
    public long solution(long n) {
        
        String[] stringN = String.valueOf(n).split("");
        Arrays.sort(stringN, Collections.reverseOrder());
        String answer = String.join("", stringN);
        
        
        return Long.parseLong(answer);
    }
}