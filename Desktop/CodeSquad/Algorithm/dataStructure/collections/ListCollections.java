package dataStructure.collections;

public interface ListCollections<T> {
    int size();
    boolean add(T data);
    boolean put(int index, T data);
    T get(int index);
    T remove(int index);
}
