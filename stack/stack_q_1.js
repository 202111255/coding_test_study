//문제 08 괄호 짝 맞추기
//소괄호는 짝을 맞춘 열린 괄호로 구성합니다. 문제에서는 열린 괄호나 닫힌 괄호가 마구 뒤섞인 문자열을 줍니다.
//이때 소괄호가 정상으로 열고 닫혔는지 판별하는 solution 함수를 구현하세요.
//만약 소괄호가 정상적으로 열고 닫혔다면 true를, 그렇지 않다면 false를 반환하면 됩니다.


//1. 문자열을 앞에서 하나씩 보며 열린 괄호가 나오면 푸시
//2. 닫힌 괄호가 나오면 팝 연산을 통해 문자열에서 열린 관호, 닫힌 괄호 한 쌍을 상쇄
//3. 1~2를 마지막 문자열까지 반복해 스택에 열린 괄호가 남아 있다면 짝이 맞지 않은 것이고, 괄호가 남아 있지 않다면 짝이 맞은 것으로 판단

function solution(s) {
    const stack = [];
    for (const c of s) {
        if (c==="(") {
            stack.push(c);
        } else if (c===")") {
            if (stack.length === 0) {
                return false;
            } else {
                stack.pop();
            }
        }
    }

    return stack.length === 0;
}

console.log(solution("()()())"));