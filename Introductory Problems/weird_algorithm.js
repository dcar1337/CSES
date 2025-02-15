let readline = require('readline');

let r = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
    terminal: false,
});

r.on('line', (line) => {
    let n = parseInt(line);
    let output = n;
    while (n != 1) {
        if (n % 2 == 0) {
            n = n / 2;
        } else {
            n = n * 3 + 1;
        }

        output += ' ' + n;
    }

    console.log(output);
});
