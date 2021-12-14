import { Car } from "./Car";

class Truck extends Car{
  weight:number;

  constructor( s:number,p:number,c:string,w:number)
  {
      super(s,p,c);
      this.weight=w;
  }

  getSalePrice():number
  {
     
      if(this.weight>2000)
      {
          return super.getSalePrice()-(super.getSalePrice()*0.1)
      }
      else
		{
			return super.getSalePrice()-(super.getSalePrice()*0.2);
		}
  }
}

 var t1 = new Truck(250,3000,"Red",2500);
 console.log(t1.getSalePrice());
 t1.display();