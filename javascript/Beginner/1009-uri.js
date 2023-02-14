let input = require('fs').readFileSync('stdin', 'utf8');
let values = input.split('\n');

let seller = values.shift();
let fixedSalary = parseFloat(values.shift());
let salesValue = parseFloat(values.shift());

let totalSalary = fixedSalary + salesValue * (15/100);

console.log('TOTAL = R$ ' + totalSalary.toFixed(2));

