//Factorial
//NAMED FUNCTION
function factNumber(num)
{
    var fact=1;
    for(var i=1;i<=num;i++)
    {
         fact=fact*i;
    }
    return fact;
}
var getFact = factNumber(5);
console.log("Factorial = "+getFact);


//FUNCTION EXPRESSION

var facNumber = function(n)
{
    var fac=1;
    for(var i=1;i<=n;i++)
    {
         fac=fac*i;
    }
    return fac;
}
var  getFac = facNumber(5);
console.log("Factorial = "+getFac);


//IIFE

(function(nu){
    var fa=1;
    for(var i=1;i<=nu;i++)
    {
         fa=fa*i;
    }
    console.log("Factorial = "+fa);
}(5))


//FAT ARROW

var getFacto= (val1)=> {
    var f=1;
    for(var i=1;i<=val1;i++)
    {
         f=f*i;
    }
    return f;
}
var pro = getFacto(4);
console.log("Factorial = "+pro);


// Prime Number

function checkPrime(x)
{
    if(x===1)
    {
        return false;
    }
    else
    if(x===2){
        return true;
    }
    else{
        for(var i=2;i<=x/2;i++){
            if(x%i==0){
                return false;
            }
        }return true;
    }
}
var cPrime = checkPrime(37);
console.log("Is the given Number Prime? = "+cPrime);



var chPrime = function(pr)
{
    if(pr===1)
    {
        return false;
    }
    else
    if(pr===2){
        return true;
    }
    else{
        for(var i=2;i<=pr/2;i++){
            if(pr%i==0){
                return false;
            }
        }return true;
    }
}
var  chPri = chPrime(5);
console.log("Is the given Number Prime? = "+chPri);



(function(primeno){
    if(primeno===1)
    {
        console.log("Is the given Number Prime? = false");
    }
    else
    if(primeno===2){
        console.log("Is the given Number Prime? = true");
    }
    else{
        for(var i=2;i<=primeno/2;i++){
            if(primeno%i==0){
                console.log("Is the given Number Prime? = false");
            }
        }console.log("Is the given Number Prime? = true");
    }
 }(5))




 var checkingPrime= (val7)=> {
    if(val7===1)
    {
        return false;
    }
    else
    if(val7===2){
        return true;
    }
    else{
        for(var i=2;i<=val7/2;i++){
            if(val7%i==0){
                return false;
            }
        }return true;
    }
}
var primenumber = checkingPrime(4);
console.log("Is the given Number Prime? = "+primenumber);





// var getArr = (a)=> {
// var sumar=0;

// {
// sumar=sumar+a;
// }
//     return sumar;
// }
// var b=[1,2,10,20];
//  for(var i=0;i<b.length;i++)
// var pro = getArr(b[i]);
// // if(i===b.length-1)
// // {
//  console.log(pro); 
// // }


