const input = require('fs').readFileSync('stdin', 'utf8');
const [code, quantity] = input.split(' ').map(value => parseInt(value));

let price;
switch (code) {
    case 1: 
        price = quantity * 4.00
        break;
        
    case 2: 
        price = quantity * 4.50
        break;

    case 3: 
        price = quantity * 5.00
        break;

    case 4: 
        price = quantity * 2.00
        break;

    case 5: 
        price = quantity * 1.50
        break;
}

console.log('Total: R$ ' + price.toFixed(2));