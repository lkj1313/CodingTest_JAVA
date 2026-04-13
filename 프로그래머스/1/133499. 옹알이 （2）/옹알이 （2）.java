class Solution {
    public int solution(String[] babbling) {
        String[] pronounce = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for(String word : babbling){
            boolean isPossible = true;
            for(String p : pronounce){
                if(word.contains(p+p)){
                    isPossible = false;
                    break;
                }
            }
            
            if(isPossible){
                for(String p : pronounce){
                    word = word.replace(p, " ");
                }
            }
            word = word.trim();
            if(word.length()==0){
                answer++;
            }
            
            
        }
        return answer;
    }
}