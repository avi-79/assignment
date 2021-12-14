var Products = /** @class */ (function () {
    function Products(i, n, p) {
        this.proId = i;
        this.proName = n;
        this.proPrice = p;
    }
    Products.prototype.calculateGst = function (gst) {
        return this.proPrice + gst;
    };
    Products.prototype.display = function () {
        console.log(this.proId);
        console.log(this.proName);
        console.log(this.proPrice);
    };
    return Products;
}());
var p1 = new Products(222, "Laptop", 45000);
p1.display();
console.log(p1.calculateGst(1000));
