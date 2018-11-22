package dataStructure.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCollection implements ListCollections {
    private int[] arr;
    private int idx;

    public ArrayListCollection() {
        arr = new int[10];
        idx = 0;
    }

    @Override
    public int size() {
        return idx;
    }

    @Override
    public boolean add(int data) {
        if(idx == arr.length - 1) {
            int[] temp = new int[(int)(arr.length * 1.5)];
            System.arraycopy(arr, 0, temp, 0, arr.length);
            arr = temp;
        }
        arr[idx++] = data;
        return true;
    }

    @Override
    public boolean put(int index, int data) {
        arr[index] = data;
        return true;
    }

    @Override
    public int get(int index) {
        if(arr.length < idx) {
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }

    @Override
    public int remove(int index) {
        if(arr.length < idx) {
            throw new IndexOutOfBoundsException();
        }
        int temp = arr[index];
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println(Arrays.toString(arr));
        idx--;
        return temp;
    }



    public static void main(String[] args) {
        ListCollections list = new ArrayListCollection();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        System.out.println();
        list.add(20);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();
        list.remove(0);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();
        list.put(0, Integer.MAX_VALUE);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();
    }
}
