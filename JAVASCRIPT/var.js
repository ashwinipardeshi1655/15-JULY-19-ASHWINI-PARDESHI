var num1=10;
var name="myname";
var num2="10";

if(num1===num2){
    console.log("equal");
}
else{
    console.log("not equal");
}

var name1=10;
var name2=20;
var equals=(name1===name2)?'true':'false';
console.log(equals);


var nname1=(name1>10)?'greater':(name1===10)?'equals':'lesser';
console.log(nname1);

var myAge=21;
console.log("type of myAge="+typeof myAge);

var myName="Ashu";
console.log("typeof myName="+typeof myName);

var hobbies=["coding","singing","dancing","nailart"];
console.log("typeof hobbies="+typeof hobbies);

var library=[
                {author:'bill gates',title:'the road ahead',bookID:1254},
                {author:'steve jobs',title:'walter isaacson',bookID:4264}
            ];
            for(var i=0;i<library.length;i++){
//console.log(library[i]);
console.log(library[i].author);
            }
//for in loop
for(var index in hobbies){
    console.log("hobbies="+hobbies[index])
}

var person={
    name: 'Ashu',
    age:'21'
    };
for(var i in person){
    console.log(person[i]);
}

//for of loop
for(var value of hobbies){
    console.log(value);
}

hobbies[5]='travelling';
hobbies['name']='jumping';
console.log("=======");
for(var value of hobbies){
    console.log("hobbies="+value);
}
console.log("=======");
for(var index in hobbies){
console.log("hobbies="+hobbies[index]);
}
console.log("=====");
console.log(hobbies);

