package dataStructure.collections;

import java.util.ArrayList;
import java.util.List;

public interface ListCollections {
    int size();
    boolean add(int data);
    boolean put(int index, int data);
    int get(int index);
    int remove(int index);
}
