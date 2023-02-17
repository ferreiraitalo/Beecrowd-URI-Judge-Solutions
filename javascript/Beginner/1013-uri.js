let input = require('fs').readFileSync('stdin', 'utf8');

let [A, B, C] = input.split(' ').map(item => parseInt(item));

let biggerAB = (A + B + Math.abs(A - B)) / 2;
let biggerMABC = (C + biggerAB + Math.abs(C - biggerAB)) / 2;

console.log(biggerMABC + ' eh o maior');


