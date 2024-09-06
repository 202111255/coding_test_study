//스택의 ADT
//스택에는 1. push, 2. pop, 3. 가득 찼는지, 4. 비었는지 확인 5. 최근 데이터의 위치를 저장하는 연산을 정의해야함

//boolean isFull()
//boolean isEmpty()
//void push(ItemType item)
//ItemType pop()
//Int top
//ItemType data[maxsize]

//스택 구현하기
const stack = [];
const maxsize = 10;

function isFull(stack) {
    return stack.length == maxsize;
}

function isEmpty(stack) {
    return stack.length == 0;
}

function push(stack, item) {
    //스택에 데이터를 추가하는 함수
    if (isFull(stack)) {
        console.log("스택이 가득 찼습니다")
    } else {
        stack.push(item);
        console.log("데이터가 추가되었습니다.")
    }
}

function pop(stack) {
    //스택에서 데이터를 꺼내는 함수
    if (stack.length === 0) {
        console.log('스택이 비어있습니다.');
        return null;
    } else {
        return stack.pop();
    }
}

//실제로는 구현하지 않아도 됨
