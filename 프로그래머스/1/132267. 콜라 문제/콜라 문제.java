class Solution {
    public int solution(int a, int b, int n) {
        int count = 0;
        while(n>=a){
            int quo = n/a;
            int remain = n % a;
            n = (n/a)*b+ remain;
            count += quo*b;
            
        }
        return count;
    }
}