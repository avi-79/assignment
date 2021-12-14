export class Car{

    speed:number;
    regPrice:number;
    color:string;
    constructor(s:number,p:number,c:string)
    {
        this.speed=s;
        this.regPrice=p;
        this.color=c;
    }
   
    getSalePrice():number
    {
        return this.regPrice;
    }
    display()
    {
        console.log(this.speed);
        console.log(this.regPrice);
        console.log(this.color);
    }
}