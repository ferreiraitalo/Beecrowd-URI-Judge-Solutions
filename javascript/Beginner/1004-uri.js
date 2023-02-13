let input = require('fs').readFileSync('stdin', 'utf8');
let valores = input.split('\n');

let x = parseInt(valores.shift());
let y = parseInt(valores.shift());

let prod = x * y;

console.log('PROD = ' + prod);