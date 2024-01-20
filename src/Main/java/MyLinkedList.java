package Main.java;

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    private class Node{
        private Object data;
        private Node previous;
        private Node next;

        private Node(Object data){
            this.data = data;
            previous = null;
            next = null;
        }
    }

    public int size (){
        return size;
    }
    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }
    public void add (Object value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else{
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        size++;
    }

    public void remove(int index){
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Wrong index");
        }
        if (index == 0) {
            head = head.next;
            if (head != null) {
                head.previous = null;
            } else {
                tail = null;
            }
        } else if (index == size - 1) {
            tail = tail.previous;
            tail.next = null;
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
        size--;
    }

    public Object get (int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index wrong");
        }
        Node current = getNodeAtIndex(index);
        return current.data;
    }

    private Node getNodeAtIndex(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index wrong");
        }
        Node current = head;
        for(int i = 0; i<index; i++){
            current = current.next;
        }
        return current;
    }
}