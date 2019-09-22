//array using new as keyword
var fruits=new Array('apple','mango','jackfruit','coconut');
console.log(fruits);

var girls=new Array('pranali','riya','neha','aishwarya','janhavi','ashwini');
console.log(girls);

var boys=new Array('vignesh','souvik','shubham','ashish');
console.log(boys);

var cartoons=new Array('tom','jerry','doremon','nobita','chota bheem');
console.log(cartoons);

var mobile=new Array('samsung','nokia','iphone','lenovo');
console.log(mobile);

//object using new keyword
var people=new Object();
people.name='John';
people.age=34;
people.gender='male';
console.log(people);

var employee=new Object();
employee.name='ram';
employee.age=45;
employee.location='mumbai';
console.log(employee);

var school=new Object();
school.name='abc';
school.noOfStudents=85;
console.log(school);

var college=new Object();
school.name='xyz';
school.noOfStudents=85;
console.log(college);

var tree=new Object();
tree.fruits=45;
tree.color='yellow';
console.log(tree);

//create 5 object without using new keyword
var person={
    name:'sharukh',
    age:60,
    height:5.8,
    getName:function(){
        return this.name;
    }
};
console.log(person);

var employeee={
    name:'sham',
    age:25,
    getName:function(){
        return this.name;
    }
};
console.log(employeee);

var school={
    name:'dfg',
    noOfStudents:89,
    getName:function(){
        return this.name;
    }
};
console.log(school);

var college={
    name:'mno',
    noOfStudents:90,
    getName:function(){
        return this.name;
    }
};
console.log(college);

var cars={
    name:'BMW',
    price:618767136,
    color:'red',
    getName:function(){
        return this.name;
    }
};

//create array without using new keyword
var friends=['a','b','c','d'];
console.log(friends);

var fruits=['mango','apple','banana','papaya'];
console.log(fruits);

var qspider=['baswangudi','thane','andheri'];
console.log(qspider);

var color=['red','yellow','black','white'];
console.log(color);

var animals=['dog','cat','horse','lion','tiger'];
console.log(animals);

//loop through the arrays created and print the value in console
var hobbies=['coding','singing','cricket','bike riding'];
var animals=['dog','cat','horse','lion','tiger'];
var color=['red','yellow','black','white'];
var fruits=['mango','apple','banana','papaya'];
var qspider=['baswangudi','thane','andheri'];

for(var index in hobbies)
{
  console.log("hobbies= " +hobbies[index]);
}

for(var i in animals)
{
  console.log(animals[i]);
}

for(var index in color)
{
  console.log("colors= " +color[index]);
}

for(var index in fruits)
{
  console.log("fruits= " +fruits[index]);
}

for(var index in qspider)
{
  console.log("qspidfer branch= " +qspider[index]);
}
