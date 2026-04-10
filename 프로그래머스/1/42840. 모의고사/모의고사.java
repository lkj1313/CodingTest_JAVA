import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5}; //7
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int p1Count=0;
        int p2Count=0;
        int p3Count=0;
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == p1[i%p1.length]){
                p1Count++;
            }
            if(answers[i] == p2[i%p2.length]){
                p2Count++;
            }
            if(answers[i] == p3[i%p3.length]){
                p3Count++;
            }
        }
        
        int max = Math.max(p1Count, Math.max(p2Count,p3Count));
        
        List<Integer> list = new ArrayList<>();
        
        if(p1Count==max){
            list.add(1);
        }
        if(p2Count==max){
            list.add(2);
        }
        if(p3Count==max){
            list.add(3);
        }
        
        
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}