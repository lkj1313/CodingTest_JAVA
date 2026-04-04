import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(int n : arr){
            if(n%divisor==0){
                list.add(n);
            }
        }
        if(list.size()==0){
            return new int[]{-1};
        } 
        answer = list.stream().mapToInt(x->x.intValue()).toArray();
        Arrays.sort(answer);
        return answer;
    }
}