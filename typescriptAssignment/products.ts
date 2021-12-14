class Products
{
    proId:number;
    proName:string;
    proPrice:number;

    constructor(i:number,n:string,p:number)
    {
        this.proId=i;
        this.proName=n;
        this.proPrice=p;
    }

    calculateGst(gst:number)
    {
        return this.proPrice + gst;
    }

    display()
    {
        console.log(this.proId);
        console.log(this.proName);
        console.log(this.proPrice);
    }


}

var p1 = new Products(222,"Laptop",45000)
p1.display();
console.log(p1.calculateGst(1000));