function solution(s) {
    let transCount = 0;
    let ridZeroCount = 0;
    
    while(s !== "1"){
        const len = s.length;
        s = s.replaceAll("0","");
        ridZeroCount += len - s.length;
        s = s.length.toString(2);
        transCount++;
    }
    
    return [transCount,ridZeroCount]
}