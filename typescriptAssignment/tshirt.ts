class Tshirt{
    color:string;
    material:string;
    design:string;
    constructor(c:string,m:string,d:string)
    {
         this.color=c;
         this.material=m;
         this.design=d;
    }
setsize(size:string)
{
   return size;
}
  display()
  {
      console.log(this.color);
      console.log(this.material);
      console.log(this.design);
  }
    
}
var t1 = new Tshirt("pink","linen","abstract");
t1.display();
console.log(t1.setsize("Small"));