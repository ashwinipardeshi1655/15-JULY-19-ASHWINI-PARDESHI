function sayHello(){
    alert('Hello!!!');
}

let buttonElement=document.getElementById('Click button');
buttonElement.onclick=function(){
    alert('hello world!');
}

function lorem(){
    alert('this msg is imp');
    let pElement=document.createElement("p");
    pElement.textContent="LOREM IS IMP FILE";
    console.log(pElement);
    document.body.appendChild(pElement);
}

let buttonElement2=document.getElementById('lorem2');
buttonElement2.onclick=function(){
    alert('dont proceed if you are not sure');
    let pElement1=document.createElement('p');
    pElement1.textContent="LOL...This site is fraud!!";
    console.log(pElement1);
    document.body.appendChild(pElement1);
}
let buttonElement1=document.getElementById('lorem3');
buttonElement1.addEventListener('click',function(){
    alert('this can put you in trouble');
    let pElement2=document.createElement('p');
    pElement2.textContent="Your activities are under observation";
    console.log(pElement2);
    document.body.appendChild(pElement2);
});
let h1Element=document.createElement('h1');
function showText(){

    let inputElement=document.getElementById('showData');
    console.log(inputElement.value);
    h1Element.textContent=inputElement.value;
    document.body.appendChild(h1Element);
}