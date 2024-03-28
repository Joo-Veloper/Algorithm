# STACK

ADT는 추상자료형이며 인터페이스에만 있고 실제로 구현은 ㅚ지 않은 자료형입니다. 일종의 자료형의 설게도 라고 생각하면 됩니다.

### Stack ADT
스택에서 PUSH, POP, isFull, isEmpty

##### boolean isFull()
스택에 들어 있는 데이터 개수가 maxisze인지 확인해 boolean 값을 반환합니다. 가득차 있다면 True, False

##### boolean isEmpty()
스택에 들어 있는 데이터가 하나 없는지 확인해 boolean값을 반환합니다. 데이터가 하나라도 있으며 false 아니면 true입니다.

##### void Push()
스택 데이터 푸쉬

##### itemType pop()
스택에서 최근에 푸기한 데이터를 팝하고, 그 데이터를 반환합니다.

##### int top
스택에서 최근에 푸시한 데이터의 위치를 기록합니다.

##### itemType data[maxsize]
스택의 데이터를 관리하는 배열입니다. 최대 maxsize계의 데이터를 관리합니다.

### Stack Class

``` 
Stack<Integer> stack = new Stack<>();
stack.push(1);
stack.push(3);
System.out.println(stack.isEmpty());
System.out.println(stack.pop());
System.out.println(stack.pop());
System.out.println(stack.isEmpty());


```

