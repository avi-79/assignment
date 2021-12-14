var Student = /** @class */ (function () {
    function Student() {
        this.stdid = 123;
        this.stdname = "avi";
        this.stdclass = 4;
    }
    Student.prototype.display = function () {
        console.log(this.stdid);
        console.log(this.stdname);
        console.log(this.stdclass);
    };
    return Student;
}());
var e1 = new Student();
e1.display();
