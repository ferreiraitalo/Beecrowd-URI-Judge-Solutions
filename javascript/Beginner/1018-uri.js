const input = require('fs').readFileSync('stdin', 'utf8');
const value = parseInt(input);

const quotient = (moneyBill, rest) => {
    let quantity = Math.floor(rest / moneyBill);
    console.log(quantity + ' nota(s) de R$ ' + moneyBill + ',00');
}

console.log(value);

let rest = value; 
quotient(100, rest); 
rest %= 100; 

quotient(50, rest); 
rest %= 50;  

quotient(20, rest);
rest %= 20;

quotient(10, rest);
rest %= 10;

quotient(5, rest);
rest %= 5;

quotient(2, rest);
rest %= 2;

quotient(1, rest);



