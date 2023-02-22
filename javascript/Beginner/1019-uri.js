const input = require('fs').readFileSync('stdin', 'utf8');
const value = parseInt(input);

const hours = Math.floor(value / 3600);
let rest = value % 3600;

const minutes = Math.floor(rest / 60);
rest %= 60;

const seconds = rest;

console.log(hours + ':' + minutes + ':' + seconds);
