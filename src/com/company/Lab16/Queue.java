package com.company.Lab16;
public interface Queue<T> {
    void add(T item);
    T remove();
    boolean isEmpty();
}
