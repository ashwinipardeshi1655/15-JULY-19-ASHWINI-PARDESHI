var color=['red','black','pink','violet'];
color.forEach(function(value,index){
    console.log('color='+value)
});

console.log("========");
color.forEach((value,index) =>{
    console.log("color="+value);
});

console.log("========");
color.push('purple','white');                              //push add elements in the last.We can add any no of elements
console.log("color after push="+color);

console.log("========");
color.pop();                                               //pop only remove one elment
console.log("color after pop="+color);

console.log("========");
color.unshift('yellow','parrot');
console.log("color after unshift="+color);

console.log("========");
color.shift();
console.log("color after shift="+color);

console.log("========");
var hascolor=color.includes("pink",2);
console.log(hascolor);

console.log("========");                              
color.splice(2,0,'green','grey');
console.log(color);

console.log("========");
var color1=color.slice(0,2)
console.log(color);
console.log(color1);

console.log("========");
var joincolor=color.join('-');              //it joints a particular char to that array...it doesnt modify original array
console.log(color);                          //it only passes new array
console.log(joincolor);

console.log("========");
var indexcolor=color.indexOf('pink');            //search for index no of that particular element
console.log(indexcolor);
var indexnone=color.indexOf('aaa');               //if that element is not present then it gives -1 as output
console.log(indexnone);

console.log("========");
var number=[10,20,30,40];
var newNumber=number.map((val,index)=>{
    val=val+10;
    return val;
});
console.log(newNumber);

console.log("========");
var filter=number.filter((val,index)=>{
    return val>30;
});
console.log("filtered array="+filter);






console.log("========");
var items=[{
    item:'pen',
    price:50
},
{
    item:'bag',
    price:500
},
{
    item:'laptop',
    price:50000
},
{
    item:'movie',
    price: 550
},
]

var filterr=items.filter((val)=>{
    return val.price>500 && val.item.length>3;
});
console.log(filterr);

console.log("========");

var mapp=items.map((val)=>{
    val.price=val.price+10;                     //to call refereal elements
    return val;
});
console.log(mapp);
