var MathsOper;
(function (MathsOper) {
    var rectangle;
    (function (rectangle) {
        function area(length, breadth) {
            console.log('Area of rectangle is ' + length * breadth);
        }
        rectangle.area = area;
        function perimeter(length, breadth) {
            console.log('Perimeter of rectangle is ' + 2 * (length + breadth));
        }
        rectangle.perimeter = perimeter;
    })(rectangle = MathsOper.rectangle || (MathsOper.rectangle = {}));
})(MathsOper || (MathsOper = {}));
