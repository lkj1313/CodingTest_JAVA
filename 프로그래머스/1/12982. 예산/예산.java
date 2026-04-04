import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int price = 0;
        int count = 0;
        Arrays.sort(d);
        for(int n : d){
            if(price+n<=budget){
                price+=n;
                count++;
            }
        }
        return count;
    }
}