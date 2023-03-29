const input = require('fs').readFileSync('stdin', 'utf8');
[n1, n2, n3] = input.split(' ').map(value => parseFloat(value));

if (n1 > n2 && n1 > n3) {
    A = n1;
    if (n2 > n3) {
        B = n2;
        C = n3;
    }
    else {
        B = n3;
        C = n2;
    }
}
else if (n2 > n3) {
    A = n2;
    if (n1 > n3) {
        B = n1;
        C = n3;
    }
    else {
        B = n3;
        C = n1;
    }
}
else {
    A = n3;
    if (n1 > n2) {
        B = n1;
        C = n2;
    }
    else {
        B = n2;
        C = n1;
    }
}

function power(value) {
    const values = Math.pow(value, 2);
    return values;
}

if (A >= B+C) console.log('NAO FORMA TRIANGULO');

else if (power(A) === power(B) + power(C)) console.log('TRIANGULO RETANGULO');

else if (power(A) > power(B) + power(C)) console.log('TRIANGULO OBTUSANGULO');

else if (power(A) < power(B) + power(C)) console.log('TRIANGULO ACUTANGULO');

if (A === B && A === C) console.log('TRIANGULO EQUILATERO');

else if (A === B || A === C || B === C) console.log('TRIANGULO ISOSCELES');