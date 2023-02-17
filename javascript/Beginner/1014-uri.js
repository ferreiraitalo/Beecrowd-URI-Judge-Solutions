let input = require('fs').readFileSync('stdin', 'utf8');
let values = input.split('\n');

let distance = parseInt(values.shift());
let fuel = parseFloat(values.shift());

let consumption = distance / fuel;

console.log(consumption.toFixed(3) + ' km/l');
