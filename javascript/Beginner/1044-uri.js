const input = require('fs').readFileSync('stdin', 'utf8');
[A, B] = input.split(' ').map(value => parseInt(value));

if (A % B === 0 || B % A === 0) console.log('Sao Multiplos');

else console.log('Nao sao Multiplos');