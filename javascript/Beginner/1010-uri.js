let input = require('fs').readFileSync('stdin', 'utf8');
let values = input.split('\n');

let item1 = values.shift().split(' ');
let item2 = values.shift().split(' ');

let codeItem1 = parseInt(item1.shift());
let quantityItem1 = parseInt(item1.shift());
let valueItem1 = parseFloat(item1.shift());

let codeItem2 = parseInt(item2.shift());
let quantityItem2 = parseInt(item2.shift());
let valueItem2 = parseFloat(item2.shift());

let total = quantityItem1 * valueItem1 + quantityItem2 * valueItem2;

console.log('VALOR A PAGAR: R$ ' + total.toFixed(2));


