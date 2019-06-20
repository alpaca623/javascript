var fs = require("fs");

// var data = fs.readFileSync('input.txt');
// console.log(data.toString());

/**
 * 모든 Node 어플리케이션의 비동기식 함수에서는 첫번째 매개변수로는 error를,
 * 마지막 매개변수로는 callback 함수를 받습니다.
 */
fs.readFile("input.txt", function(err, data) {
  if (err) return console.error(err);
  console.log(data.toString());
});

console.log("Program has ended");

/**
 * callback 함수를 사용하여 이렇게 프로그램의 흐름을 끊지 않음으로서,
 * Non-Blocking 코드를 사용하는 서버는 Blocking 코드를 사용하는 서버보다
 * 더 많은 양의 요청을 빠르게 처리 할 수 있게됩니다.
 */