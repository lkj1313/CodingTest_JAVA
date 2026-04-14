class Solution {
    public int solution(int[] ingredient) {
        int[] stack = new int[ingredient.length];
        int top = 0;
        int count = 0;
        for(int num : ingredient){
            stack[top++] = num;
            
            if(top>=4&&stack[top-1] ==1 && stack[top-2] == 3 && stack[top-3] ==2 && stack[top-4] == 1 ){
                count++;
                top-=4;
                
            }
        }
        
        return count;
    }
}