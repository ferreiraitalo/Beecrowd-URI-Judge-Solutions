const input = require('fs').readFileSync('stdin', 'utf8');
const values = input.split('\n');

const lineOne = values.shift().split(' ');
const lineTwo = values.shift().split(' ');

const X1 = parseFloat(lineOne.shift());
const Y1 = parseFloat(lineOne.shift());
const X2 = parseFloat(lineTwo.shift());
const Y2 = parseFloat(lineTwo.shift());

const distance = Math.sqrt(Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2));

console.log(distance.toFixed(4));

