package Main.java;

import java.util.NoSuchElementException;

public class MyQueue {
    private int front;
    private int rear;
    private Object[] array;
    private int size;

    public MyQueue(){
        front = 0;
        rear = 0;
        array = new Object[10];
        size = 0;
    }

    public void add(Object value){
        if (size == array.length) {
            Object[] newArray = new Object[2*size];
            System.arraycopy(array, front, newArray, 0, array.length - front);
            System.arraycopy(array, 0, newArray, array.length - front, rear + 1);
            this.array = newArray;
            front = 0;
            rear = size - 1;
        }
        rear = (rear + 1) % array.length;
        array[rear] = value;
        size++;
    }

    public void clear(){
        front = 0;
        rear = 0;
        array = new Object[10];
        size = 0;
    }

    public int size(){
        return size;
    }

    public Object peek(){
        if (size == 0) {
            throw new NoSuchElementException("This queue is currently empty");
        }
        return array[front];

    }
    public Object poll (){
        if (size == 0){
            throw new NoSuchElementException("This queue is currently empty");
        }
        Object value = array[front];
        array[front] = null;
        front = ( front + 1 ) % array.length;
        size--;
        return value;
    }
}
