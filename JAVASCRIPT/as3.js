var cloth=['top','jeans','skirt','tshirt'];
var cities=['Mumbai','Kalyan','Panvel','Dadar'];
var string=['AshwiniSureshPardeshi'];
var name=['SonuMonuTauDaduChiu'];


//for each
cloth.forEach(function(value,index){
    console.log('cloth='+value)
});

console.log("========");
cities.forEach(function(value,index){
    console.log('cities='+value);
});

//arrow function
console.log("========");
cloth.forEach((value,index) =>{
    console.log('cloth='+value);
});

console.log("========");
cities.forEach((val,index)=>{
    console.log('cities='+val);
});

//push method
console.log("========");
cloth.push('shirt','trouser');
console.log('cloth after push='+cloth);

console.log("========");
cities.push('kolkata','banglore');
console.log('cities after push='+cities);

//pop method
console.log("========");
cloth.pop();
console.log('cloth after pop='+cloth);

console.log("========");
cities.pop();
console.log('cities after pop='+cities);

//unshift method
console.log("========");
cloth.unshift('onepiece','gown');
console.log('cloth after unshift='+cloth);

console.log("========");
cities.unshift('chennai','hyderabad');
console.log('cities after unshift='+cities);

console.log("========");
cloth.shift();
console.log('cloth after shift='+cloth);

console.log("========");
var hascloth=cloth.includes('salvar','6');
console.log('cloth after includes='+hascloth);

console.log("========");
cloth.splice(4,1,'kudta','dupatta');
console.log('cloth after splice='+cloth);

console.log("========");
var cloth1=cloth.slice(0,3)
console.log('cloth after slice='+cloth);
console.log('cloth after slice='+cloth1);

console.log("========");
var joincloth=cloth.join('...');
console.log('cloth before joincloth='+cloth);
console.log('cloth after joincloth='+joincloth);

console.log("========");
var indexcloth=cloth.indexOf('shirt');
console.log('actal list='+cloth);
console.log('index of shirt='+indexcloth);

console.log("========");
var number=[20,40,60,80];
var Newnumber=number.map((val,index)=>{
    val=val+20;
    return val;
});
console.log('number after adding 20='+Newnumber);

console.log("========");
var filter=number.filter((val,index)=>{
    return val>60;
});
console.log('number after filter='+filter);