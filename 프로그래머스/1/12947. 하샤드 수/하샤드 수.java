class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        char[] arr = String.valueOf(x).toCharArray();
        int length = arr.length;
        int sum = 0;
        for(char c : arr){
           sum+= (c - '0'); 
        }
        if(x%sum!=0){
            answer = false;
        }
        return answer;
    }
}