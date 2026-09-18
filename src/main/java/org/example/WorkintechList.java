package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<E> extends ArrayList<E> {

    @Override
    public boolean add(E e) {
        if (this.contains(e)) {
            return false;
        }
        return super.add(e);
    }

    @Override
    public void add(int index, E element) {
        if (!this.contains(element)) {
            super.add(index, element);
        }
    }

    @Override
    public boolean remove(Object o) {
        boolean removed = super.remove(o);
        if (removed) {
            sort();
        }
        return removed;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public void sort() {
        Collections.sort((ArrayList) this);
    }
}