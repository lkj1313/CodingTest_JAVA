class Solution {
    public int[] solution(long n) {
        String sn = String.valueOf(n);
        char[] asn = sn.toCharArray();
        int[] answer = new int[asn.length];
        
        for(int i=0; i<asn.length; i++){
            answer[i] = asn[asn.length-i-1] - '0';
        }
        
        return answer;
    }
}