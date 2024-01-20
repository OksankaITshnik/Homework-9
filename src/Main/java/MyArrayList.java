package Main.java;

public class MyArrayList{
    private static final int INIT_SIZE = 10;
    Object[] array;
    private int size;
    public MyArrayList(){
        this.array = new Object[INIT_SIZE];
        this.size = 0;
    }
    public void add(Object value){
        if(size == array.length){
            Object[] newArray = new Object[size*2];
            System.arraycopy(this.array, 0, newArray, 0, this.size);
            this.array = newArray;
        }
        this.array[size] = value;
        this.size++;
    }

    public void remove(int index){
        if (index >= this.size || index < 0){
            throw new IndexOutOfBoundsException("Non existent index");
        }
        System.arraycopy(this.array, index + 1, this.array, index, size - 1 - index);
        this.size--;
        this.array[this.size - 1] = null;
    }

    public void clear(){
        this.array = new Object[10];
        this.size = 0;
    }

    public int size(){
        return this.size;
    }

    public Object get(int index){
        if (index >= this.size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        return this.array[index];
    }
}