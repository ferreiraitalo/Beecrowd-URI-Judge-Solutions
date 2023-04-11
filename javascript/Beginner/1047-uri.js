const input = require('fs').readFileSync('stdin', 'utf8');
[initialHour, initialMinute, finalHour, finalMinute] = input.split(' ').map(value => parseInt(value));

const initial = initialHour * 60 + initialMinute;
const final = finalHour * 60 + finalMinute;
let duration = 0;

if (initial < final) duration = final - initial;

else duration = (24 * 60 - initial) + final;

const durationHour = duration / 60;
const durationMinute = duration % 60;

console.log('O JOGO DUROU ' + Math.floor(durationHour) + ' HORA(S) E ' + durationMinute + ' MINUTO(S)');