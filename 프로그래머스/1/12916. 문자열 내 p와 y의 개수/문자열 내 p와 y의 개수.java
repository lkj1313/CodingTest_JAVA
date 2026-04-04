class Solution {
    boolean solution(String s) {
       char[] lowedS = s.toLowerCase().toCharArray();
       int pCount = 0;
       int yCount = 0;
       for(char c : lowedS){
           if(c=='p'){
               pCount++;
           } else if(c=='y'){
               yCount++;
           }
       }
       boolean answer = pCount == yCount ? true : false;
        return answer;
    }
    
}