"use strict";
exports.__esModule = true;
exports.Car = void 0;
var Car = /** @class */ (function () {
    function Car(s, p, c) {
        this.speed = s;
        this.regPrice = p;
        this.color = c;
    }
    Car.prototype.getSalePrice = function () {
        return this.regPrice;
    };
    Car.prototype.display = function () {
        console.log(this.speed);
        console.log(this.regPrice);
        console.log(this.color);
    };
    return Car;
}());
exports.Car = Car;
