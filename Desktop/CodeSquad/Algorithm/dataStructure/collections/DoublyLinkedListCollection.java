package dataStructure.collections;

import java.util.LinkedList;
import java.util.List;

public interface DoublyLinkedListCollection<T> {
    int size();
    boolean add(T data);
    boolean put(int index, T data);
    boolean addFirst(T data);
    boolean addLast(T data);
    T removeFirst();
    T removeLast();
    T get(int index);
    T remove(int index);
}
