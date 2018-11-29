package dataStructure.collections;

import java.util.List;

public class DoublyLinkedList<T> implements DoublyLinkedListCollection {
    private Node<T> head = new Node<>();
    private Node<T> tail = new Node<>();
    int count = 0;

    public DoublyLinkedList() {
        head.prev = tail.next = null;
        head.next = tail.prev;
        tail.prev = head.next;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean add(Node data) {
        if(count == 0) {
            data.prev = tail.prev;
            data.next = head.next;
        } else {
            
        }
        return true;
    }

    @Override
    public boolean put(int index, Node data) {
        return false;
    }

    @Override
    public boolean addFirst(Node data) {
        return true;
    }

    @Override
    public boolean addLast(Node data) {

        return true;
    }

    @Override
    public Object removeFirst() {
        return null;
    }

    @Override
    public Object removeLast() {
        return null;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public String toString() {
        return "DoublyLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }

    public static void main(String[] args) {
        DoublyLinkedListCollection<String> list = new DoublyLinkedList<>();
        System.out.println(list.size());
        list.add(new Node(1));
        System.out.println(list.toString());
        //list.addLast(new Node(2));
        //list.addFirst(new Node(3));
        // 3 1 2 //
        //System.out.println(list.toString());
    }
}
