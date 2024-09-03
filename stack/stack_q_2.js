//문제 9. 10진수를 2진수로 변환하기
//10진수를 입력받아 2진수로 변환해 반환하는 solution 함수를 구현하세요

//1. 10진수 N을 2로 나눈 나머지, 즉 %2 연산을 한 값을 저장하고, N은 2로 나눔
//2. 몫이 0이 아니라면 나머지를 버리고 다시 1을 수행
//3. 모든 과정이 끝나고 1에서 저장한 수를 뒤부터 순서대로 가져와 붙이기

function solution(decimal) {
    const stack = [];

    while(decimal > 0) {
        const remainder = decimal % 2;
        stack.push(remainder);
        demical = Math.floor(decimal/2);
    }
    let binary = "";
    while (stack.length > 0) {
        binary += stack.pop()
    }
    return binary;
}
    

console.log(solution(13));
