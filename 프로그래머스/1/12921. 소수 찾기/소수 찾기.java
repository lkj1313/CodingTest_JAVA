import java.util.*;
class Solution {
    public int solution(int n) {
        List<Integer> answer = new ArrayList<>();
        int count = 0;
        for(int i=1; i<=n; i++){
            if(isPrime(i)){
                count++;
            }
        }
        
        return count;
    }
    private boolean isPrime(int number){
        if(number==1) return false;
        if(number==2) return true;
        if(number%2==0) return false;
        for(int i=3; i<=Math.sqrt(number); i+=2){
            if(number%i==0) return false;
        }
        return true;
    }
}