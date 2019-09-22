var heroine="Deepika Padukon";
var capital= heroine.toLowerCase()
console.log("capital="+capital);

console.log("========");
var small=heroine.toUpperCase()
 console.log(small);

 console.log("========");
var pos3=heroine.charAt(3);
console.log(pos3);

console.log("========");
var index=heroine.indexOf('p',0);
console.log(index);

console.log("========");
console.log(heroine.includes('p',3));

console.log("========");
console.log(heroine.replace('P','D'));

console.log("========");
var split=heroine.split('d',3);
console.log(split);

console.log("========");
var substring=heroine.substr(0,5);
console.log(substring);

console.log("========");
var search=heroine.search('P');
console.log(search);

console.log("========");
var update="    updating"
var trim=update.trim();
console.log(trim)