function solution(s)
{
    const stack = [];
    
    const splitedS = s.split('');
    
    for(let i=0; i<splitedS.length;i++){
        if(stack.length===0){
            stack.push(splitedS[i]);
        } else{
            if(stack[stack.length-1] === splitedS[i]){
                stack.pop();
            } else{
                stack.push(splitedS[i]);
            }
        }
    }
    if(stack.length===0){
        return 1;
    } else{
        return 0;
    }
     
}