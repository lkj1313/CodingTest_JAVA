class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        boolean isFirst = true;
        int length = arr.length;
        
        for(int i=0; i<length; i++){
            if(arr[i] == ' '){
                isFirst = true;
            } else{
                if(isFirst == true){
                    arr[i] = Character.toUpperCase(arr[i]);
                    isFirst = false;
                } else{
                    arr[i] = Character.toLowerCase(arr[i]);
                }
            }
        }
        return new String(arr);
    }
}