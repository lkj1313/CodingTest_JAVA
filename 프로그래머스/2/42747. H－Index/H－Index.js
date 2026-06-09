function solution(citations) {
    citations.sort((a,b) => b-a); /// [6,5,3,1,0]
    for(let i=0; i<citations.length; i++){
        if(citations[i]<i+1){
            return i;
        }
    }
    return citations.length;
}