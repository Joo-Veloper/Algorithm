package Basic.Chap10;

class ListNode {
    int key;
    int data;
    ListNode next;

    public ListNode(int key, int data) {
        this.key = key;
        this.data = data;
        this.next = null;
    }
}

class HashMapJoo {
    private ListNode[] buckets;
    private int capacity;

    public HashMapJoo(int capacity) {
        this.capacity = capacity;
        this.buckets = new ListNode[capacity];
    }

    private int hashFunction(int key) {
        return key % capacity;
    }

    public void put(int key, int data) {
        int index = hashFunction(key);
        ListNode newNode = new ListNode(key, data);

        if (buckets[index] == null) {
            buckets[index] = newNode; // 인덱스가 가리키는 위치에 연결 리스트가 없으면 새로운 노드를 추가합니다.
        } else {
            ListNode current = buckets[index];
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode; // 이미 연결 리스트가 있는 경우, 마지막 노드 뒤에 새로운 노드를 추가합니다.
        }
    }

    public int get(int key) {
        int index = hashFunction(key);
        ListNode current = buckets[index];

        while (current != null) {
            if (current.key == key) {
                return current.data; // 해당 key값을 가진 데이터를 찾으면 반환합니다.
            }
            current = current.next;
        }

        return -1; // 데이터를 찾지 못한 경우 -1을 반환합니다.
    }
}

public class Main {
    public static void main(String[] args) {
        HashMapJoo hashMap = new HashMapJoo(13);

        // 데이터 추가
        hashMap.put(20, 200);
        hashMap.put(33, 330);

        // 데이터 탐색
        System.out.println("20의 데이터: " + hashMap.get(20)); // 200 출력
        System.out.println("33의 데이터: " + hashMap.get(33)); // 330 출력
    }
}