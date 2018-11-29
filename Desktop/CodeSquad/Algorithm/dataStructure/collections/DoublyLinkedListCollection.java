package dataStructure.collections;

import java.util.LinkedList;
import java.util.List;

public interface DoublyLinkedListCollection<T> {
    int size();
    boolean add(Node<T> data);
    boolean put(int index, Node<T> data);
    boolean addFirst(Node<T> data);
    boolean addLast(Node<T> data);
    T removeFirst();
    T removeLast();
    T get(int index);
    T remove(int index);
}
