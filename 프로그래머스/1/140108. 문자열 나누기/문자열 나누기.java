class Solution {
    public int solution(String s) {
        char x = ' ';
        int sameCount = 0;
        int diffrentCount = 0;
        int answer = 0;
        
        for(int i =0; i<s.length(); i++){
            
            if(sameCount==0 && diffrentCount==0){
                x = s.charAt(i);
                sameCount = 1;
                continue;
            }
            
            if(s.charAt(i) == x){
                sameCount++;
            } else{
                diffrentCount++;
            }
            
            if(sameCount == diffrentCount){
                answer++;
                
                sameCount=0;
                diffrentCount =0;
            }
            
            
            
        }
        if (sameCount != 0 || diffrentCount != 0) {
            answer++;
        }
        
        return answer;
        
    }
}