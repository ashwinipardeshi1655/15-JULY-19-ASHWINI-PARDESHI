//closure function
function sum(a,b){
    function addSum(){
        return a+b;
    }
    return addSum;
}
var addfunct= sum(10,20);
var total=addfunct();
console.log('Total',total);

console.log("========");
console.log(window);
console.log(this);

console.log(this===window);

var name='Angadh';
console.log(window.name);
console.log(this.name);

var person={
    name: 'Dulquer Salman',
    age: '21',
    getname:function(){
        console.log('getname method='+this.name);
        console.log(window);
        getData();
        function getData(){
            console.log('Get data method',this.name);
        }
        return this.name;
    
    }
}
var heroname=person.getname();
console.log('name='+heroname);

//var keyword
console.log("========");
for(var i=0;i<5;i++){
    console.log(i);
}
console.log('Value of i='+i);

//let keyword
for(let j=0;j<5;j++){
    console.log(j);
}
//console.log('Value of j='+j);

//var keyword
var hobbies=['dancing','singing','cricket'];
console.log('Hobbies '+hobbies);                         //declaration using var
var hobbies=['nailart'];
console.log('hobbies '+hobbies);                         //redeclaration using var
hobbies=['singing'];
console.log('hobbies '+hobbies);                         //reinitialization using var

//let keyword
let color=['black','brown','pink'];
console.log('color '+color);                              //declaration using let
// let hobbies=['yellow'];
// console.log('color '+color);                           //redeclaration using let
color=['black'];
console.log('color '+color);                               //reinitialization using let

//const keyword
const accesory=['lipstick','eyeliner','kajal'];               //declaration using const
console.log('accesory '+accesory);
// const accesory=['nailpaint'];                                                             
// console.log('accesory '+accesory);
// accesory=['lipstick'];
// console.log('accesory '+accesory);
accesory[2]=['mole','chocolate'];
console.log('accesory '+accesory);