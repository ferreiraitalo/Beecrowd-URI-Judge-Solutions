const input = require('fs').readFileSync('stdin', 'utf8');
[hour1, hour2] = input.split(' ').map(value => parseInt(value));
let duration = 0;

if (hour1 > hour2) duration = 24 - hour1 + hour2;

else if (hour1 < hour2) duration = hour2 - hour1;

else duration = 24;

console.log('O JOGO DUROU ' + duration + ' HORA(S)');