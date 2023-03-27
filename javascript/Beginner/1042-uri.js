const input = require('fs').readFileSync('stdin', 'utf8');
const values = [num1, num2, num3] = input.split(' ').map(value => parseInt(value));
const newValues = [];

for (let i = 0; i < values.length; i++) {
    newValues[i] = values[i];    
}

function sortNumbers (A, B) {
    return A - B;
}

function sort (values) {
    for (let i = 0; i < values.length; i++) {
        console.log(values.sort(sortNumbers)[i]);
    }
}

function original (newValues) {
    for (let i = 0; i < newValues.length; i++) {
        console.log(newValues[i]);
    }
}

sort(values);
console.log();
original(newValues);










