const input = require('fs').readFileSync('stdin', 'utf8');

const [time, speed] = input.split('\n').map(values => parseInt(values));

const litersNeeded = (time * speed) / 12;

console.log(litersNeeded.toFixed(3));