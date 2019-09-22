let resultData = new Promise(function(resolve,reject){
    if(10===11){
        reject('Failed');
    }else{
        resolve('success');
    }
});
resultData.then((data)=>{
    console.log('Then block='+data);
}).catch((error)=>{
    console.log('Catch block='+error);
});



let employeeData = new Promise(function(resolve,reject){
    const employee = [

                        {
                             name : 'shahrukh',
                            age: 60
                        },
                        {
                            name: 'sundari',
                            age: 30
                        },
                        {
                            name: 'Akshay',
                            age: 50
                        }
                    ];
    if(10>10){
        reject('Failed');
    }else{
        resolve(employee);
    }
});
employeeData.then((data)=>{
    // console.log('Employee Data=',data);
    return data;
}).catch((error)=>{
    console.log('Catch block='+error);
}).then(function(data1){
    console.log('This is then block 2',data1);
});