var a = 12;
var b = 25;
var c = 89;
var greatest;
if (a >= b && a >= c) {
    greatest = a;
}
else if (b >= a && b >= c) {
    greatest = b;
}
else {
    greatest = c;
}
console.log("the largest is" + greatest);
