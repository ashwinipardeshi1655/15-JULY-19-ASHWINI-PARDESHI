let pElement=document.getElementById('demo');
console.log(pElement);
pElement.textContent='This is new p tag';
let nameElements=document.getElementsByName('helement');
console.log(nameElements);
let buttonElement=document.createElement('button');
buttonElement.textContent='CLICK ME';
console.log(buttonElement);
document.body.appendChild(buttonElement);
let spanEle = document.getElementById('spanid');
spanEle.style.color = 'red';
let buttonElement1= document.getElementById('buttonElement');
//buttonElement1.className="add";
buttonElement1.className='add add1';