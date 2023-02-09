package week8.Part3;

public class SimpleLinkedList {
    private Node head;
    private int size;

    private static class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public SimpleLinkedList() {
        head = null;
        size = 0;
    }

    public int get(int idx) {
        if (idx<0|| idx>=size){
            return  -1;
        }
        Node node = head;
        for (int i = 0; i<idx; i++){
            node = node.next;
        }
        return node.value;
    }

    public void addAtHead(int value) {
        Node newHead = new Node(value, head );
        head = newHead;
        size++;
    }

    public void addAtTail(int value) {
        if (size>0){
            Node node = head;
            for (int i = 0; i<size-1; i++){
               node = node.next;
            }
            node.next = new Node(value, null);
        }else {
            head = new Node(value, null);
        }
        size++;
    }

    public void addAtIndex(int index, int value){

    }

    public void deleteAtIndex(int index){

    }

    public int size(){
        return size;
    }


}
