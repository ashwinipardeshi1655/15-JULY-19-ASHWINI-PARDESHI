var fruits=['apple','banana','mango','orange'];
console.log(fruits);
fruits[4]='grapes';

for(var i=0;i<fruits.length;i++)
{
    console.log(fruits[i]);
}

var todayDate= new Date();
console.log("todays date="+todayDate);
var today= new Date(100);
console.log("today="+today);

var Date=new Date("October 15,2010 12:00:00");
console.log("Date="+Date);

//var birth = new Date(2007,4,27,7,30,45,0);
//console.log("birth="+birth);

var Month=['jan','feb','mar','april','may','jun','jul','aug','sept','oct','nov','dec'];
var day=['sun','mon','tues','wed','thurs','fri','sat']
console.log(Month[todayDate.getMonth()]);

console.log(Math.ceil(4.6));
console.log(Math.floor(4.6));
console.log(Math.round(6.9));
console.log(Math.pow(2,3));
console.log(Math.round((Math.random()*20)));

var name="rahul";
console.log(name);
var name1 = name;
console.log(name1);
var name1="gandhi";
console.log(name);
console.log(name1);

var person ={
    name:"tanu"
}
console.log(person.name);

var person1=person;
console.log(person.name);
console.log(person1.name);

person1.name="anu";
console.log(person1.name);