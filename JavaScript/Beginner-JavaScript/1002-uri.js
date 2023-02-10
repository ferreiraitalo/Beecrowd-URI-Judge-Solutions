let input = require('fs').readFileSync('stdin', 'utf8');

let raio = parseFloat(input);
let PI = 3.14159;
let area = PI * Math.pow(raio, 2);

console.log('A=' + area.toFixed(4));

