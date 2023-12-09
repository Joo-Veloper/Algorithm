package Basic.Chap04;

public class IntStack {
    private int[] stk;
    private int capacity;
    private int ptr;

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {
        }
    }

    public class OverflowIntStackExceptino extends RuntimeException {
        public OverflowIntStackExceptino() {
        }
    }

    public IntStack(int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            stk = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    //push
    public int push(int x) throws OverflowIntStackExceptino {
        if (ptr >= capacity) // 스택이 가득
            throw new OverflowIntStackExceptino();
        return stk[ptr++] = x;
    }

    //pop
    public int pop() throws EmptyIntStackException {
        if (ptr <= 0)    // 스택이 비워짐
            throw new EmptyIntStackException();
        return stk[--ptr];
    }

    // peek
    public int peek() throws EmptyIntStackException {
        if (ptr <= 0)
            throw new EmptyIntStackException();
        return stk[ptr - 1];
    }

    // 스택 요소 삭제
    public void clear() {
        ptr = 0;
    }

    // 스택에서 x를 찾아 인덱스
    public int indexOf(int x) {
        for (int i = ptr - 1; i >= 0; i--) {
            if (stk[i] == x) {
                return i;
            }
            return -1;
        }
        public int getCapacity() {
            return capacity;
        }
    }
}

