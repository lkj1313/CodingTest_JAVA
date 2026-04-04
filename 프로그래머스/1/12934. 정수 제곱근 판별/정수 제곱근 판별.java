class Solution {
    public long solution(long n) {
        long answer = 0;
        double nSqrt = Math.sqrt(n);
        if(nSqrt == (int) nSqrt){
            answer = (long) ((nSqrt+1) * (nSqrt+1));
        } else{
            answer = -1;
        }
        return answer;
    }
}