let input = require('fs').readFileSync('stdin', 'utf8');
let valores = input.split('\n');

let notaA = parseFloat(valores.shift());
let notaB = parseFloat(valores.shift());
let notaC = parseFloat(valores.shift());

let media = (notaA * 2 + notaB * 3 + notaC * 5) / 10.0

console.log('MEDIA = ' + media.toFixed(1));