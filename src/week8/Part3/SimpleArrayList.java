package week8.Part3;

import java.util.Arrays;

public class SimpleArrayList {
    private int size;
    private int capacity;
    private int currentIdx;
    private int[] array;
    private static int DEFAULT_CAPACITY = 5;

    public SimpleArrayList(){
        array = new int[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
        size = 0;
        currentIdx = 0;
    }

    public SimpleArrayList(int size){
        array = new int[size];
        capacity = size;
        this.size = 0;
        currentIdx = 0;
    }

    public void add(int element){
        if (currentIdx>= capacity){
            capacity = 2*capacity;
            array = Arrays.copyOf(array, capacity);
        }

        array[currentIdx] = element;
        size++;
        currentIdx++;

    }
    public int get(int idx) {
        if (idx<0 || idx>size){
            System.out.println("Impossible to get element for this index: " + idx);
            return  -1;
        }else {
            return array[idx];
        }

    }
    public int size(){
        return size;
    }
}
