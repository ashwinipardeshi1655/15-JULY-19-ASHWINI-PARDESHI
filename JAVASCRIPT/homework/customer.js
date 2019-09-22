function validateForm(){
let formData=document.forms[0];
let firstname=formData.uname.value;
let lastname=formData.lname.value;
let add=formData.aname.value;
if(firstname.length>7 && lastname.length>7 && add.length>10){
    formData.uname.style.border='2px solid green';
    formData.lname.style.border='2px solid green';
    formData.aname.style.border='2px solid green';
    formData.loginSubmit.disabled=false;
}else{
    formData.uname.style.border='2px solid red';
    formData.lname.style.border='2px solid red';
    formData.aname.style.border='2px solid red';
    formData.loginSubmit.disabled=true;
}}