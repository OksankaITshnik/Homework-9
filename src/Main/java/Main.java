package Main.java;

public class Main {
    public static void main(String[] args){

        MyArrayList family = new MyArrayList();
        System.out.println("Testing MyArrayList:");
        family.add("Oksanka");
        family.add("María");
        family.add("Juan");
        family.add("Daniel");
        System.out.println("Family size: " + family.size());
        System.out.println("Family second member:" + family.get(1));
        family.remove(2);
        System.out.println("Family size after applying remove() method: " + family.size());
        family.clear();
        System.out.println("Family size after applying clear() method: " + family.size() + "\n");



        MyLinkedList familia = new MyLinkedList();
        System.out.println("Testing MyLinkedList:");
        familia.add("Oksanka");
        familia.add("María");
        familia.add("Juan");
        familia.add("Daniel");
        System.out.println("Familia size: " + familia.size());
        System.out.println("Familia's third member:" + familia.get(2));
        familia.remove(1);
        System.out.println("Familia size after remove(): " + familia.size());
        familia.clear();
        System.out.println("Familia size after clear(): " + familia.size() + "\n");



        MyQueue simya = new MyQueue();
        System.out.println("Testing MyQueue:");
        simya.add("Oksana");
        simya.add("María");
        simya.add("Juan");
        simya.add("Daniel");
        System.out.println("Simya size: " + simya.size());
        System.out.println("Show first member:" + simya.peek());
        System.out.println("Show and remove first member:" + simya.poll());
        System.out.println("Show and remove second member:" + simya.poll());
        simya.clear();
        System.out.println("Simya size after applying clear() method: " + simya.size() + "\n");



        MyStack relatives = new MyStack();
        System.out.println("Testing MyStack");
        relatives.push("Oksanka");
        relatives.push("María");
        relatives.push("Juan");
        relatives.push("Daniel");
        System.out.println("Relatives size: " + relatives.size());
        System.out.println("Relatives top member" + relatives.peek());
        System.out.println("Removing top member" + relatives.pop());
        System.out.println("Size after pop()" + relatives.size());
        relatives.clear();
        System.out.println("Size after clear(): " + relatives.size() + "\n");

    }
}
