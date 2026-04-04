import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String sN = String.valueOf(n);
        for(char s : sN.toCharArray()){
            answer += s - '0';
        }
        return answer;
    }
}