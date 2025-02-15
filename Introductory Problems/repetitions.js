let readline = require('readline');

let r = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
    terminal: false,
});

r.on('line', (line) => {
    let _letters = line.split('');
    let _count = 1;
    let _maxCount = 0;
    let _previousLetter = '';
    for (const letter of _letters) {
        if (_previousLetter == '' || _previousLetter != letter) {
            _previousLetter = letter;
            _maxCount = _maxCount < _count ? _count : _maxCount;
            _count = 1;
        } else {
            _count++;
        }

        _maxCount = _maxCount < _count ? _count : _maxCount;
    }
    console.log(_maxCount);
});
