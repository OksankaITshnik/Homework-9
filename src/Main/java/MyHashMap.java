package Main.java;

public class MyHashMap {
    private Node[] buckets;
    private int capacity;
    private int size;

    public MyHashMap(){
        capacity = 16;
        buckets = new Node[capacity];
        size = 0;
    }

    public void put (Object key, Object value){
        if (key==null){
            return;
        }
        int bucketIndex = getBucketIndex(key);
        Node newNode= new Node(key,value);

        if (buckets[bucketIndex] == null){
            buckets[bucketIndex] = newNode;
        } else {
            Node currentNode= buckets[bucketIndex];
            Node prevNode = null;
            while (currentNode != null){
                if(currentNode.key.equals(key)){
                    currentNode.value = value;
                    return;
                }
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
            prevNode.next = newNode;
        }
        size++;
    }

    public void remove(Object key) {
        if (key == null) {
            return;
        }
        int bucketIndex = getBucketIndex(key);
        Node currentNode = buckets[bucketIndex];
        Node prevNode = null;
        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                if (prevNode != null) {
                    prevNode.next = currentNode.next;
                } else {
                    buckets[bucketIndex] = currentNode.next;
                }
                size--;
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public void clear(){
        for(int i = 0; i<capacity; i++){
            buckets[i] = null;
        }
        size = 0;
    }

    public int size(){
        return size;
    }

    public Object get(Object key){
        if(key == null){
            return null;
        }
        int bucketIndex = getBucketIndex(key);
        Node currentNode = buckets[bucketIndex];
        while (currentNode != null){
            if(currentNode.key.equals(key)){
                return currentNode.value;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    private int getBucketIndex(Object key){
        return Math.abs(key.hashCode() % capacity);
    }

    private static class Node{
        Object key;
        Object value;
        Node next;

        public Node(Object key, Object value){
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
}
