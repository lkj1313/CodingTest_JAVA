function solution(elements) {
    let length = elements.length; // [1,2]
    let arr = [...elements, ...elements]; //[1,2,3,1,2,3]
    const set = new Set();
    for(let i=0;  i<length; i++){
        let sum=0;
        for(let len=1; len<=length; len++){
            sum+=arr[i+len-1];
            set.add(sum);
        }
    }
    return set.size
}