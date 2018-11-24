package dataStructure.collections;

public final class ArrayListCollection<T> implements ListCollections {
    private Object[] arr;
    private int idx;

    public ArrayListCollection() {
        arr = new Object[10];
        idx = 0;
    }

    @Override
    public int size() {
        return idx;
    }

    @Override
    public boolean add(Object data) {
        if(idx == arr.length - 1) {
            Object[] temp = new Object[(int)(arr.length * 1.5)];
            System.arraycopy(arr, 0, temp, 0, arr.length);
            arr = temp;
        }
        arr[idx++] = (T)data;
        return true;
    }

    @Override
    public boolean put(int index, Object data) {
        arr[index] = (T)data;
        return true;
    }

    @Override
    public T get(int index) {
        if(arr.length < idx) {
            throw new IndexOutOfBoundsException();
        }
        return (T)arr[index];
    }

    @Override
    public T remove(int index) {
        if(idx < index) {
            throw new IndexOutOfBoundsException();
        }
        T temp = (T)arr[index];
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        idx--;
        return temp;
    }



    public static void main(String[] args) {
        ListCollections<Integer> list = new ArrayListCollection();
        for (int i = 0; i < 11; i++) {
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
