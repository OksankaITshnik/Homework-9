package Main.java;

public class MyStack {
    private Node top;
    private int size;

    private class Node {
        Object value;
        Node next;

        public Node(Object value) {
            this.value = value;
        }
    }
    public void push (Object value){
        Node newNode = new Node (value);
        newNode.next = top;
        top = newNode;
        size++;
    }
    public Object pop (){
        if (isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        Node nodeToRemove = top;
        top = top.next;
        size--;
        return nodeToRemove.value;
    }

    public Object peek (){
        if (isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        return top.value;
    }
    public void clear(){
        top = null;
        size = 0;
    }
    public int size (){
        return size ;
    }
    public boolean isEmpty (){
        return size == 0;
    }
}
