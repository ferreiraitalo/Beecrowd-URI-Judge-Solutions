let input = require('fs').readFileSync('stdin', 'utf8');
let values = input.split('\n');

let employeeNumber = parseInt(values.shift());
let workedHours = parseInt(values.shift());
let timeValue = parseFloat(values.shift());

let salary = workedHours * timeValue;

console.log('NUMBER = ' + employeeNumber);
console.log('SALARY = U$ ' + salary.toFixed(2));

