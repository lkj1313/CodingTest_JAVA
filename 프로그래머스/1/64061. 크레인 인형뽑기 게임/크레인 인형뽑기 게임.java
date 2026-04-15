import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Deque<Integer> stack = new ArrayDeque();
        int count = 0;
        for(int n : moves){
            int col = n-1;
            for(int row = 0; row<board.length; row++){
                if(board[row][col]!=0){
                    int dol = board[row][col];
                    board[row][col] =0;
                    if(!stack.isEmpty()&&stack.peek()==dol){
                        count+=2;
                        stack.pop();
                    } else{
                        stack.push(dol);
                    }
                    break;
                }
            }
        }
        
        return count;
    }
}