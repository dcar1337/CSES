let readline = require('readline');

let r = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
    terminal: false,
});

let n = null;
let numbers = [];

r.on('line', (line) => {
    if (!n) {
        n = parseInt(line);
    } else {
        numbers = line.split(' ').map(Number);
        findMissingNumber(numbers, n);
        n = null;
    }
});

function findMissingNumber(numbers, n) {
    let _completeNumbers = new Set(Array.from({ length: n }, (_, i) => i + 1));

    numbers.forEach((number) => _completeNumbers.delete(number));

    console.log([..._completeNumbers][0]);
}
