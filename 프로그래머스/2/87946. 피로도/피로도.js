function solution(k, dungeons) {
    let maxCount = 0;
    const n = dungeons.length;
    const visited = new Array(n).fill(0);
    
    function dfs(fatigue,count){
        maxCount = Math.max(maxCount, count);
        for(let i=0; i<n; i++){
            if(!visited[i]&& fatigue>=dungeons[i][0]){
                visited[i] = true;
                dfs(fatigue-dungeons[i][1], count+1);
                visited[i] = false;
            }
        }
        
    }
    dfs(k,0);
    return maxCount;
}