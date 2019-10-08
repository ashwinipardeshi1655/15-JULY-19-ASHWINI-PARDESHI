/// <reference path ="./circle.ts" />
/// <reference path ="./rect.ts" />

MathOperations.Circle.areaOfCircle(2);
MathsOper.rectangle.perimeter(3,5);

// let myName="Ashu";
// let company;
// company = 'testyantra';
// company= 23;
// console.log(company);
// console.log(myName);

// let sample: number | string ;
// sample=10;
// sample='true';

// let myArray=[123,'ashu',true];
// console.log(myArray);

// let yourArray:string[]=['ash','ahdtqjd'];
// console.log(yourArray);

// let myTuple:[string,number,boolean]=['fdg',456,true];
// console.log(myTuple);

// enum colors{
//     red = 'danger',
//     green = "success",
//     grey= "primary",
//     black= "dark"
// }
// console.log(colors);
// console.log(colors.black);

// class Person{
//     constructor(public personName:string,public personAge:number){
//     }
// }

// let person =new Person("ashu",21);
// console.log(person.personName);
// console.log(person.personAge);

// let myNav ="ashuu";
// myNav=null;

// class Car{
//     brand: string="BMW";
//     static model: string='x5';
// }
// let bmwcar = new Car();
// console.log(bmwcar.brand);
// console.log(Car.model);

// class Fourwheeler{
//     constructor(public brand:string,public model:string){

//     }
// }

// let audiFourwheeler= new Fourwheeler('Audi','X5');
// console.log(audiFourwheeler.brand);
// console.log(audiFourwheeler.model);

// let benzFourwheeler: Fourwheeler={
//     brand:'Benz',
//     model:'0002'
    
// }


// class Person{
//     constructor(public name:string , public age:number){}
// }
// class Student extends Person{
//     constructor(public myName:string,public myAge:number , public USN:number){
//         super(myName,myAge);

//     }
// }
// let person1 = new Person('Dinga',21)
// let student1= new Student('Dingi',34,99999);
// console.log(student1.USN);


// class Person{
//     constructor(public name:string,public age:number,public degree?: string){}
// }
// let person1: Person={
//     name: 'asgh',
//     age: 43
// }
// let person2: Person={
//     name: 'thg',
//     age: 6,
//     degree: 'enggineering'
// }

// interface Student{
//     name:string;
//     age:number;
//     printDetails():void;

    
// }

// class Person implements Student{
//     name= "ajsjd";
//     age=34;
//     printDetails(){
//         console.log('name is '+this.name + "age is "+this.age);
//     }
// }

// function getArray<p>(items:p[]):p[]{
//     return new Array<p>().concat(items);
// }
// let strArray=getArray<string>(['sdf','ddd','fsds']);
// let numArray=getArray<number>([54,6,456,445]);
// numArray.push(52);


// let person1 = new Person();
// person1.printDetails();

// let student1: Student={
//     name: 'dghj',
//     age: 56,
//     printDetails:()=>{
//         console.log('name is '+student1.name + 'age is '+student1.age);
//     }
// }

// student1.printDetails();