import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int[] results = new int[number];
        int answer = 0;
        for(int i=0; i<number; i++){
            results[i] = divisiorCount(i+1)>limit ? power : divisiorCount(i+1);
        }
        answer = Arrays.stream(results).sum();
        return answer;
    }
    private int divisiorCount(int n){
        int count = 0;
        for(int i =1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                if(i*i==n){
                    count++;
                } else{
                    count+=2;
                }
            }
        }
        return count;
    }
}