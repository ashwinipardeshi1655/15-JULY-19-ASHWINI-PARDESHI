//named function
function getSum(num1,num2){
    var sum = num1 + num2;
    return sum;
}
 var sumValue=getSum(10,20);
console.log(sumValue);

//Function expression
var sumData= function(number1,number2){
    var sum=number1+ number2;
    return sum;
}
var sumValue1= sumData(5,20);
console.log(sumValue1)

//IIFE immediately invoked function expression
// (function(a,b){
// var sum = a+b;
// console.log("sum="+sum);
// }(10,40))

//fat arrow function
//var getSumData=(c,d)=>{
    //var sumVal1= c+d;
  //  return sumVal1;
//}
//var value=getSumData(100,200);
//console.log(value);

//hoisting
console.log(name);
var name="gandhi";

console.log(name1)

var name1="ashu";
console.log(name1);

function fname(){
console.log(name2);
var name2='ashwini';
console.log(name2);
}fname();

function fnname(){
    console.log(name5);
    var name5='ashwini';
    console.log(name5);
}fnname();

// fname();
function first(callback){
    setTimeout(function(){
    console.log("first");
    callback();
});
}

function second()
{
    console.log("second");
}
first(second);