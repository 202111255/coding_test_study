// 문제1) 배열 정렬하기
// 정수 배열을 정렬해서 반환하는 solution() 함수를 완성하세요

let solution = (arr) => {
    return arr.sort((a, b) => a - b);
    //a - b가 양수이면, a가 b보다 뒤에 위치해야 한다고 판단하여 순서를 바꾼다
    //a - b가 음수이면, a가 b보다 앞에 위치해야 한다고 판단하여 그대로 둔다.
    //내림차순 정렬: return arr.sort((a, b) => b - a);
};


const arr2 = [1, -5, 2, 4, 3];
console.log(solution(arr2))


//sort() 메서드를 사용하지 않고 O(N^2) 정렬 알고리즘을 사용하면?
function bubbleSort(arr) {
    const n = arr.length;
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n-i-1; j++) {
            if (arr[j+1] < arr[j]) {
                const tmp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = tmp;
            }
            

        }
    }
    return arr;
}

function doSort(arr) {
    arr.sort((a,b) => a-b);
    return arr;
}

function measureTime(callback, arr) {
    const start = Date.now();
    const result = callback(arr);
    const end = Date.now;
    return [end-start, result];
}

let arr = Array.from({length:10000}, (_,k) => 10000-k);

//첫번째 코드 시간 측정
const [bubbleTime, bubbleResult] = measureTime(bubbleSort, arr);
console.log(`첫번째 코드 실행 시간: ${bubbleTime}ms`);

//첫번째 코드 시간 측정
let arr3 = Array.from({length:10000}, (_,k) => 10000-k);
const [doSortTime, doSortResult] = measureTime(doSort, arr3);
console.log(`두번째 코드 실행 시간: ${doSortTime}ms`);