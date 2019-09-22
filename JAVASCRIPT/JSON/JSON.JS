let employeeJSON= {
    name: 'Dinga',
    age: 24,
    hobbies: ['dancing','singing']
}

console.log(`My name is ${employeeJSON.name}`);   //string interpollation
console.log(employeeJSON);

//
let jsonObject = JSON.stringify(employeeJSON);
console.log(jsonObject);

let jsObject=JSON.parse(jsonObject);
console.log(jsObject);
