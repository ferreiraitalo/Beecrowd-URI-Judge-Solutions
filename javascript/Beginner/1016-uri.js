const input = require('fs').readFileSync('stdin', 'utf8');

const distance = parseInt(input.split());

const time = distance * 2;

console.log(time + ' minutos');