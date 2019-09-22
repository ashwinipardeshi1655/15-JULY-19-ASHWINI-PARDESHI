function passval(){
let empData=document.forms[0];
let userval=empData.uname.value;
let keyval=empData.pname.value;
if(userval=='' && keyval==''){
    document.getElementById('err1').innerHTML=
    `<p id='p1' style="color: red">Invalid input</p>`;
    document.getElementById('err2').innerHTML=
    `<p id='p2' style="color: red">Invalid input</p>`;
    // empData.loginSubmit.disabled=true;
}else if(userval.length>5 && keyval.length>5){
    var parent=document.getElementById('err1');
    var child=document.getElementById('p1');
    parent.removeChild(child);
    var parent=document.getElementById('err2');
    var child=document.getElementById('p2');
    parent.removeChild(child);

    // empData.loginSubmit.disabled=true;
}
else{
    document.getElementById('err1').innerHTML=
    `<p id='p1' style="color: red">Invalid input</p>`;
    document.getElementById('err2').innerHTML=
    `<p id='p2' style="color: red">Invalid input</p>`;
    // empData.loginSubmit.disabled=false;
}

}