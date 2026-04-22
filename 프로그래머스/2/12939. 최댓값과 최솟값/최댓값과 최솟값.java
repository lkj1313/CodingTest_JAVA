import java.util.*;
class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int length = arr.length;
        int[] numArr = new int[length];
        
        for(int i=0; i<length; i++){
            numArr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(numArr);
        int min = numArr[0];
        int max = numArr[length-1];
        
        String strMin = String.valueOf(min);
        String strMax = String.valueOf(max);
        
        return strMin+" "+strMax;
    }
}