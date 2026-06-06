function solution(priorities, location) {
    const q = priorities.map((p,i)=>[p,i]);
    let count = 0;
    while(q.length>0){
        const [p,i] = q.shift();
        const hasHigher = q.some(([pri])=>pri>p);
        if(hasHigher){
            q.push([p,i]);
        } else{
            count++;
            if(i===location){
                return count;
            }
        }
        
    }
}