//먼저 들어간 데이터가 먼저 나오는 자료구조
//자바스크립트에서는 배열의 push()메서드와 shift()메서드를 이용하여 큐를 흉내내어 구현해야 함
//push(): 배열의 가장 마지막에 요소를 추가
//shift(): 배열의 가장 첫번째 요소를 삭제

const queue = [];

//큐에 데이터 추가
queue.push(1);
queue.push(2);
queue.push(3);

//큐의 맨 앞 데이터 제거
let firstItem = queue.shift();
console.log(firstItem);

//큐에 데이터 추가
queue.push[4];
queue.push[5];

//큐의 맨 앞 데이터 제거
firstItem = queue.shift();
console.log(firstItem);
