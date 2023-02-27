const input = require('fs').readFileSync('stdin', 'utf8');
const [A, B, C] = input.split(' ').map(value => parseFloat(value));

const delta = Math.pow(B, 2) - 4 * A * C;

if (2 * A === 0 || delta < 0) {
   console.log('Impossivel calcular'); 
}

else {
    const R1 = (-B + Math.sqrt(delta)) / (2 * A);
    const R2 = (-B - Math.sqrt(delta)) / (2 * A);

    console.log('R1 = ' + R1.toFixed(5));
    console.log('R2 = ' + R2.toFixed(5));   
}




