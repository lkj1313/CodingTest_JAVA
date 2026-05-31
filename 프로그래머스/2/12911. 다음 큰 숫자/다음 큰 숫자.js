function solution(n) {
    let nOneCount =0;
    let dummy = n.toString(2).split('').forEach((s)=>{
        if(s==='1'){
            nOneCount++;
        }
    })
    for(let i=n+1; i<=1000000; i++){
        let count = 0;
        let dummy = i.toString(2).split('').forEach((s)=>{
            if(s==='1'){
                count++
            }
        })
        if(count===nOneCount){
            return i;
        }
    }
    return nOneCount;
}