const input = require('fs').readFileSync('stdin', 'utf8');
const values = input.split('\n');

const value = values[0].split(' ');
const N1 = parseFloat(value[0]);
const N2 = parseFloat(value[1]);
const N3 = parseFloat(value[2]);
const N4 = parseFloat(value[3]);
const examGrade = parseFloat(values[1]);

const average = (N1*2 + N2*3 + N3*4 + N4) / 10;

console.log('Media: ' + average.toFixed(1));

if (average >= 7.0) {
    console.log('Aluno aprovado.');
}

else if (average < 5.0) {
    console.log('Aluno reprovado.');
}

else {
    console.log('Aluno em exame.');
    console.log('Nota do exame: ' + examGrade.toFixed(1));
    const finalAverage = (average + examGrade) / 2;

    if (finalAverage >= 5.0) {
        console.log('Aluno aprovado.')        
    }

    else {
        console.log('Aluno reprovado.')
    }

    console.log('Media final: ' + finalAverage.toFixed(1))
}


