function solution(n, words) {
    const used = new Set();
    used.add(words[0])
    for(let i=0; i<words.length-1; i++){
        const lastChar = words[i][words[i].length-1];
        const firstChar = words[i+1][0];
        const failIndex = i+1;
        if(lastChar!==firstChar){
            
            return [(failIndex)%n+1, Math.floor(failIndex / n) + 1];
        }
        if(used.has(words[i+1])){
            return [(failIndex)%n+1, Math.floor(failIndex / n) + 1];
        }
        used.add(words[i+1]);
    }
    return [0,0];
}