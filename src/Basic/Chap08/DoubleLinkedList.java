package Basic.Chap08;

public class DoubleLinkedList<E> {
    class Node<E>{
        private E data;
        private Node<E> prev;
        private Node<E> next;

        Node(){
            data = null;
            prev = next = this;
        }

        Node(E obj, Node<E> prev, Node<E> next) {
            data = obj;
            this.prev = prev;
            this.next = next;
        }
    }
    private Node<E> head;
    private Node<E> crnt;

    public DoubleLinkedList() {
        head = crnt = new Node<E>();
    }

    public boolean isEmpty() {
        return head.next == head;
    }
}
