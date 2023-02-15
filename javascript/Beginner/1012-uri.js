let input = require('fs').readFileSync('stdin', 'utf8');
let values = input.split(' ');

let A = parseFloat(values.shift().replace(',', '.'));
let B = parseFloat(values.shift().replace(',', '.')); 
let C = parseFloat(values.shift().replace(',', '.'));

let triangleArea = (A * C) / 2;
let circleArea = Math.PI.toFixed(5) * Math.pow(C, 2);
let trapezoidArea = ((A + B) * C) / 2;
let squareArea = B * B;
let rectangleArea = A * B;

console.log('TRIANGULO: ' + triangleArea.toFixed(3));
console.log('CIRCULO: ' + circleArea.toFixed(3));
console.log('TRAPEZIO: ' + trapezoidArea.toFixed(3));
console.log('QUADRADO: ' + squareArea.toFixed(3));
console.log('RETANGULO: ' + rectangleArea.toFixed(3));


