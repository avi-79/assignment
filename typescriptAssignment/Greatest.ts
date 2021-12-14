let a:number=12;
let b:number=25;
let c:number=89;
let greatest;

if(a>=b && a>=c){
    greatest =a;
}
else if(b>=a&& b>=c){
   greatest=b;
}
else {
    greatest=c;
}
console.log("the largest is"+ greatest);