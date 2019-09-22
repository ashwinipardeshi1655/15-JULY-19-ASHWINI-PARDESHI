function validateForm(){
    let formData= document.forms[0];
    //console.log(formData.uname.value);
    let username1= formData.uname.value;
    let passkey1=formData.pass.value;
    if(username1.length>4 && passkey1.length<7){
        // console.log("success");
        formData.uname.style.border='2px solid green';
        formData.pass.style.border='2px solid green';
        formData.loginSubmit.disabled=false;
    }else{
        formData.uname.style.border='2px solid red';
        formData.pass.style.border='2px solid red';
        formData.loginSubmit.disabled=true;
    }}


    // let passkey=formData.pass.value;
    // if(passkey.length>5){
        // console.log("success");
        // formData.pass.style.border='2px solid green';
    // }else{
        // formData.pass.style.border='2px solid red';
    // }
// }

// function validatepass(){
//     let FormData=document.forms[0];
//     let passkey=FormData.pass.value;
//     if(passkey.length>5){
//         console.log("success");
//     }else{
//         FormData.pass.style.border='2px solid red';
//     }
// }
