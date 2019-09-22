function validateForm(){
    let formData=document.forms[0];
    let firstname=formData.uname.value;
    let lastname=formData.aname.value;
    let compname=formData.tname.value;
    let empID=formData.ename.value;
    if(firstname.length>5 && lastname.length>5){
        formData.uname.style.border='2px solid green';
        formData.aname.style.border='2px solid green';
        formData.loginSubmit.disabled=false;
    }else{
        formData.uname.style.border='2px solid red';
        formData.aname.style.border='2px solid red';
        formData.loginSubmit.disabled=true;
    }

}