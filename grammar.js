//자바스크립트에서는 모든 숫자에 대한 값을 number타입으로 정의
console.log(typeof 10)

//숫자 타입 변수 선언
let a = 13;
let b = 4;

//빌트인 함수
console.log(Math.abs(-a))

//숫자 타입 논리 연산
console.log(a && b); //AND 연산, 4
console.log(a || b); //OR 연산, 13
console.log(!a) //Not 연산, false

//부동 소수점 문제
//만약 자바스크립트에서 10%3.2와 같은 연산을 한다면 0.4가 아닌 0.3999999947이 나옴 -> 오차: 앱실론
console.log(Number.EPSILON);
let c = 0.1 + 0.1 + 0.1;
let d = 0.3;
console.log(c-d);

//자바스크립트는 문자도 문자열 타입으로 저장 ' '' `
const e = "Hello, World";
const f = `Hello ${"World"}`;
console.log(f);

//문자열 타입 빌트인 메서드
console.log(e.length);
console.log(e.split(","));
console.log(e.startsWith("Hello"));
console.log(e.endsWith("World"));
console.log(e.includes("llo, "));
console.log(e.indexOf("World"));
console.log(e.lastIndexOf("l"));
console.log(e.replace("World", "JavaScript"));
console.log(e);
console.log(e.toUpperCase());
console.log(e.toLowerCase());
console.log(e.concat("!!"));

//숫자와 문자열을 제외한 나머지 원시 타입은 불리언, bigint, null, undefined가 있다

//참조타입 - 오브젝트(배열도 오브젝트), 함수 -> 둘은 원시 타입과 메모리 참조 방식이 다름
//참조 타입이 메모리에 할당될 때는 힙 메모리 영역에 저장된 값을 가리키는 메모리 주소를 저장

//오브젝트 타입의 사용방법
const obj = {
    name : 'Bada',
    age : 23,
    'full-name': "Bada Kang"
};
console.log(obj.name);
console.log(obj['age'])
console.log(obj['full-name'])
//요소 추가
obj.city = 'seoul';
console.log(obj.city)
//요소 삭제
delete obj.city
console.log(obj.city)

//배열 선언
const arr = [1, 2, 3];
console.log(arr[0])

//배열 길이 구하기
console.log(arr.length)

//요소 추가
arr.push(4);
console.log(arr[3]);

//요소 삭제
const value = arr.pop();
console.log(value);


//자바스크립트에서 함수는 일급 객체이자 타입 (일급 객체: 변수에 할당할 수 있고, 함수의 인자로 전달할 수 있고, 함수에서 반환할 수 있는 객체)
const func = () => {};
console.log(typeof func)

//일반적인 함수
function fn1(param1, param2) {
    return null;
}
//화살표 함수
const fn2 = (param1, param2) => {
    return null
}

//코딩테스트 코드 구현 노하우
//1. 구조 분해 할당
//1-1 배열을 구조분해 할당
const arr1 = ['Hello', 'World', "!"];
const [first, second] = arr1;
console.log(first, second);
console.log(typeof first)
//1-2 객체를 구조분해 할당
const obj2 = {name: "강", publisher: "바다"};
const {name, publisher} = obj2;
console.log(name, publisher);
console.log(typeof publisher)
//배열의 구조분해 할당은 대괄호를 이용
//객체의 구조분해 할당은 중괄호를 이용, 필요한 요소를 키로 구조분해 할당 가능

//2. 값 교환하기
let a1 = 5;
let b1 = 10;
let temp;
temp = a;
a1 = b1;
b1 = temp;
//구조 분해 할당 시
let p = 5;
let q = 10;
[p, q] = [q, p];
console.log(p);
console.log(q);

//3. 비구조화 할당
//함수에 객체를 인수로 전달할 때 필요한 것만 꺼내서 사용할 수 있는 문법 기법
const makePerson = ({familyName, givenName, address}) => {
    console.log(`1 ${familyName}`);
    console.log(`2 ${givenName}`);
    console.log(`3 ${address}`);
    return {
        name: `${givenName} ${familyName}`,
        address,
    }
};

const person = makePerson({
    familyName: 'Kang',
    givenName: 'Bada',
    address: 'Seoul',
    country: 'South Korea',
});

console.log(person);

//4. 스프레드 연산자
//배열이나 객체 여러 개를 하나로 합쳐야 할 때는 스프레드 연산자를 사용
//4-1 배열 병합
const evenNumbers = [2, 4, 6, 8, 10];
const oddNumbers = [1, 3, 5, 7, 9];
const numbers = [...evenNumbers, ...oddNumbers];
console.log(numbers);
//4-2 객체 병합
const person2 = {
    name: 'bada Kang',
    familyName: 'Kang',
    givenName: 'bada',
    country: 'korea'
};
const address = {
    country: 'South korea',
    city: 'Seoul'
};
const merge = {...person2, ...address};
console.log(merge);

//배열 내 같은 요소 제거하기
const names = ['Lee', 'Kim', 'Park', 'Lee', 'Kim'];
const uniqueNames = [...new Set(names)];
console.log(uniqueNames);

//&&와 ||로 조건문 대체하기
const flag = true;
flag && func();

const makeCompany = (showAddress) => {
    return {
        name: 'GoldenRabbit',
        ...showAddress && {address: 'Seoul'}
    };
};
console.log(makeCompany(false));
console.log(makeCompany(true));