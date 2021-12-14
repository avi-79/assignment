class Student{
    stdid:number=123;
    stdname:string="avi";
    stdclass:number=4;

display(){
 console.log(this.stdid);
 console.log(this.stdname) ;
 console.log(this.stdclass);
}
}
var e1 = new Student();
e1.display();