class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int length = s.length();
        if(length!=4&&length!=6){
            return false;
        }
        char[] charedS = s.toCharArray();
        for(char ss : charedS){
            if(!Character.isDigit(ss)){
                return false;
            }
        }
        
        return true;
    }
}