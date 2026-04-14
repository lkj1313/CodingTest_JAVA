import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 1; i<=n; i++){
            map.put(i,1);
        }
        for(int i = 0; i<lost.length; i++){
            map.put(lost[i], map.get(lost[i])-1);
        }
          for (int i = 0; i < reserve.length; i++) {
            map.put(reserve[i], map.getOrDefault(reserve[i], 0) + 1);
        }
        for(Integer value : map.values()){
            if(value>0) count++;
        }
        Arrays.sort(lost);
        for(int lo : lost){
            if (map.get(lo) >= 1) continue;
            if(map.getOrDefault(lo-1,0)>=2){
                count++;
                map.put(lo-1, map.get(lo-1)-1);
                continue;
            }
            if(map.getOrDefault(lo+1,0)>=2){
                count++;
                map.put(lo+1,map.get(lo+1)-1);
                continue;
            }
        }
        return count;
    }
}