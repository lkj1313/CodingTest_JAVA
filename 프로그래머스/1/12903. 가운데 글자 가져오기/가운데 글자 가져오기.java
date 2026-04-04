class Solution {
    public String solution(String s) {
        int length = s.length();
        String answer = "";
        if(length%2==0){
            answer += s.charAt((length/2)-1);
            answer += s.charAt(length/2);
        } else{
            answer += s.charAt(length/2);
        }
        return answer;
    }
}