import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int length = A.length;
        for(int i=0; i<length/2; i++){
            int temp = B[i];
            B[i] = B[length-1-i];
            B[length-1-i] = temp;
        }
        int answer = 0;
        for(int i=0; i<length; i++){
           answer+= A[i] * B[i];
        }
        return answer;
    }
}