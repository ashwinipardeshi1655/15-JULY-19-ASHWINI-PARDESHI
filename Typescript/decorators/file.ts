function printConstructor(cons: Function){
    console.log(cons);
}
@printConstructor
class Sample{
    constructor(){
        console.log('hii hello i m sample class constructor');
    }
}