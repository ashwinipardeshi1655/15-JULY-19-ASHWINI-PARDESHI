function fact(n){
    if(n===0||n===1){
        return 1;
    }else{
        return fact(n-1)*n;
    }
}
let factorialValue = fact(5);
console.log(factorialValue);