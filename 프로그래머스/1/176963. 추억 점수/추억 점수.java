import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new HashMap<>();
        int[] result = new int[photo.length];
        
        for(int i =0; i<name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        for(int j=0; j<photo.length; j++){
            int sum = 0;
            for(int i=0; i<photo[j].length; i++){
                if(map.containsKey(photo[j][i])){
                    sum += map.get(photo[j][i]);
                }
            }
            result[j] = sum;
        }
        
        return result;
    }
}