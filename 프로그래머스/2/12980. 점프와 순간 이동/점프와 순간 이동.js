function solution(n)
{
   let bettery = 0;
   while(n>0){
       if(n%2===0){
           n=n/2;
       } else{
           bettery++;
           n--;
           
       }
   }
 return bettery;
}