const input = require('fs').readFileSync('stdin', 'utf8');
const value = parseInt(input);

const year = Math.floor(value/365);
let rest = value % 365;

const month = Math.floor(rest/30);
rest %= 30;

const day = rest;

console.log(year + ' ano(s)\n' + month + ' mes(es)\n' + day + ' dia(s)');