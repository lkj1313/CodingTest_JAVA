import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        
        for(int i =0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum)){
                       count++;
                    }
                    
                }
            }
        }
        return count;
    }
    private boolean isPrime(int n){
        if(n==1) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3; i<=Math.sqrt(n); i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
}