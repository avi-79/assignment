var Tshirt = /** @class */ (function () {
    function Tshirt(c, m, d) {
        this.color = c;
        this.material = m;
        this.design = d;
    }
    Tshirt.prototype.setsize = function (size) {
        return size;
    };
    Tshirt.prototype.display = function () {
        console.log(this.color);
        console.log(this.material);
        console.log(this.design);
    };
    return Tshirt;
}());
var t1 = new Tshirt("pink", "linen", "abstract");
t1.display();
console.log(t1.setsize("Small"));
