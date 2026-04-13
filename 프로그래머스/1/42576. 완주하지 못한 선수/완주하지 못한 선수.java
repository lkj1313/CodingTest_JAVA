import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        
        Map<String,Integer> map = new HashMap<>();
        
        for(int i=0; i<participant.length; i++){
            String par = participant[i];
            
            map.put(par, map.getOrDefault(par,0)+1);
            
            
        }
        
        for(int i=0; i<completion.length; i++){
            String com = completion[i];
            
            map.put(com, map.get(com)-1);
            
        }
        
        for(String key : map.keySet()){
            if(map.get(key)>0){
                return key;
            }
        }
        return "";
    }
}