//getElementbyId()
let pElement=document.getElementById('demo');                      //it will sort the elements by id name
console.log(pElement);
pElement.textContent='This is new p tag';         
//getelementbyClassName()
let divElements=document.getElementsByClassName('blue');         //it will sort the elements by class name
console.log(divElements);
let pElements=document.getElementsByTagName('p');                   //it will sort the elements by tag name
console.log(pElements);
let nameElements=document.getElementsByName('helement');         //it will sort the elements by name helement
console.log(nameElements);
let demoElement=document.querySelector('#demo');           //this will return only first element which has clsname as 'demo'
console.log(demoElement);
let blueClassElements = document.querySelectorAll('.blue');   //this will return all the elements which has idname as 'blue'
console.log(blueClassElements);
let buttonElement = document.createElement('button');
buttonElement.textContent="click me";
console.log(buttonElement);
document.body.appendChild(buttonElement);   //this will specify the position of button in html document
let spanEle = document.getElementById('spanid');
spanEle.style.color='pink';
let buttonElement1= document.getElementById('buttonElement');
buttonElement1.classname="add";
//buttonElement1.classList='add add1';
document.getElementById('tableid').innerHTML=
`<table border=1>
<tr>
    <td>name</td>
    <td>Age</td>
</tr>
<tr>
    <td>Ashu</td>
    <td>21</td>
</tr>
<tr>
    <td>Tau</td>
    <td>16</td>
</tr>
<tr>
    <td>dadu</td>
    <td>10</td>
</tr>


</table>`;

// let tableEle=document.createElement('table');
// let tr1=document.createElement('tr');
// let trd1=document.createElement('td');
// console.log()

let pElementData = document.getElementById('demo1');
//pElementData.style.color = 'blue';
//pElementData.className = 'blue';
pElement.classList = 'blue fonts';
