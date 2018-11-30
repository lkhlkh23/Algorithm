package dataStructure.collections;

import java.util.LinkedList;
import java.util.List;

public interface DoublyLinkedListCollection<T> {
    int size();
    void add(T data);
    void put(int index, T data);
    void addFirst(T data);
    void addLast(T data);
    T removeFirst();
    T removeLast();
    T get(int index);
    T remove(int index);
}
