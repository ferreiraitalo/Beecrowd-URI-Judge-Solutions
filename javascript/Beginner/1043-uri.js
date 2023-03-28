const input = require('fs').readFileSync('stdin', 'utf8');
[A, B, C] = input.split(' ').map(value => parseFloat(value));

if (A + B > C && A + C > B && B + C > A) {
    const perimeter = A + B + C;
    console.log('Perimetro = ' + perimeter.toFixed(1));
}

else {
    const area = ((A + B) * C) / 2.0
    console.log('Area = ' + area.toFixed(1));
}