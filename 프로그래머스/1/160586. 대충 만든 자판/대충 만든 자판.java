class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for(int i=0; i<targets.length; i++){
            String target = targets[i]; // 단어
            int count =0;
            boolean isPossible = true;
            for(int k=0; k<target.length(); k++){
                char ch = target.charAt(k); // char
                int cidx = 10000;
                for(int j=0; j<keymap.length; j++){
                    int idx = keymap[j].indexOf(ch);
                    if(idx!=-1){
                        cidx = Math.min(cidx, idx);
                    }
                }
                if(cidx==10000){
                    isPossible = false;
                    break;
                } else{
                    count+= cidx+1;
                }
            }
            answer[i] = isPossible ? count : -1;
        }
        return answer;
    }
}