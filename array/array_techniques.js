//자주 활용하는 배열 기법

//1. 배열에 데이터 추가
//push() 메서드
let arr = [1,2,3];
arr.push(4);

//concat() 메서드
arr = arr.concat([5, 6]);

//스프레드 연산자
arr = [...arr, ...[7, 8]]
console.log(arr);

//unshift() 메서드 -> 배열의 맨 앞에 데이터 추가하기(자바스크립트에서 최적화를 하여 시간 복잡도 O(n)보다는 작다)
arr.unshift(0);
console.log(arr);

//splice()메서드 -> 배열 중간에 데이터 추가하기
arr.splice(2, 1, 9999); //인덱스, 삭제할 데이터의 수, 추가할 데이터
console.log(arr);


//2. 배열에서 데이터 삭제
//pop()메서드
arr = [1, 2, 3, 4, 5];
const poppedElement = arr.pop();
console.log(poppedElement);

//shift()메서드 - 맨 앞 데이터 삭제 후 반환
const shiftedElement = arr.shift();
console.log(arr);

//splice()메서드 -> 중간 데이터 삭제
arr = [1, 2, 3, 4, 5];
arr.splice(2, 2);
console.log(arr);


//3. 고차 함수를 이용하여 데이터에 특정 연산 적용\
const str = `자바스크립트는 배열에 map(), filter(), reduce()와 같은 유용한 고차 함수를 기본으로 제공하므로 이를 이용해
기존 배열에 기반하여 새로운 배열을 만드는 것이 가능하다.`;
//배열에 제곱 연산 적용 예
const numbers = [1,2,3,4,5];
const squares = numbers.map(num => num*num);
console.log(squares);

//짝수 필터링 예
const evens = numbers.filter(num => num%2 === 0);
console.log(evens);

//전체 합 예
const sum = numbers.reduce((a, b) => a+b);
console.log(sum);

