function validate()
{
    let employeeData= document.forms['employeeForm'];
    let passkey= employeeData.pname.value;
    let Cpasskey= employeeData.cname.value;
    if(passkey==='' && Cpasskey===''){
        return false;
    }else if(passkey === Cpasskey){
        alert('success');
        return true;
    }else{
        alert("password didn't match");
        return false;
    }
}