import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<numbers.length; i++){
            for(int k= i+1; k<numbers.length; k++){
                int sum = numbers[i] + numbers[k];
                set.add(sum);
            }
        }
        
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}