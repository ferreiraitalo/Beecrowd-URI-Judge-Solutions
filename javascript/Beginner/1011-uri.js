let input = require('fs').readFileSync('stdin', 'utf8');
let value = input.split(' ');

let radius = parseFloat(value.shift());

let volume = (4/3.0) * Math.PI.toFixed(5) * Math.pow(radius, 3);

console.log('VOLUME = ' + volume.toFixed(3));