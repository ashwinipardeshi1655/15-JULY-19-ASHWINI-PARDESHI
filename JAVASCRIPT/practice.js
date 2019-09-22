function factNumber(n)
{
    var fact=1;
    for(var i=1;i<=n;i++)
    {
    fact=fact*i;
    }
    return fact;
}
var getfact=factNumber(5)
console.log(getfact)

//function expression

var factt=function(n)
{
    var facto=1;
    for(var j=1;j<=n;j++)
    {
        facto=facto*j;
    }
    return facto;
}
var getfacto=factt(5)
console.log(getfacto)

//IIFE

(function(n)
{
    var facty=1;
    for(var k=1;k<=n;k++)
    {
        facty=facty*k;
    }
    console.log(facty);
}(5))