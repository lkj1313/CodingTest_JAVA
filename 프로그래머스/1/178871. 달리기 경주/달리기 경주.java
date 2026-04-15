import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String,Integer> map = new HashMap<>();
        
        for(int i =0; i<players.length; i++){
            map.put(players[i], i);
        }
        
        for(String calledPlayer : callings){
            
            int idx = map.get(calledPlayer);
            int front = idx-1;
            
            String frontPlayer = players[front];
            
            players[front] = calledPlayer;
            players[idx] = frontPlayer;
            
            map.put(calledPlayer, front);
            map.put(frontPlayer,idx);
            
        }
        return players;
    }
}