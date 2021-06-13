package com.example.demo.generic;

import java.io.Serializable;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MyCollection {//MyCollection<T>

    public static void main(String[] args) {
        Set<Integer> s = MyCollection.emptySet();
        Set<String> s2 = MyCollection.emptySet();
    }

    public static final Set EMPTY_SET = new EmptySet();
    //public final Set EMPTY_SET<T> = new EmptySet();

    @SuppressWarnings("unchecked")
    public static final <T> Set<T> emptySet() {
        return (Set<T>) EMPTY_SET;
    }


    private static class EmptySet<E>
            extends AbstractSet<E>
            implements Serializable
    {
        private static final long serialVersionUID = 1582296315990362920L;

        public Iterator<E> iterator() { return null;}

        public int size() {return 0;}
        public boolean isEmpty() {return true;}
        public void clear() {}

        public boolean contains(Object obj) {return false;}
        public boolean containsAll(Collection<?> c) { return c.isEmpty(); }

        public Object[] toArray() { return new Object[0]; }

        public <T> T[] toArray(T[] a) {
            if (a.length > 0)
                a[0] = null;
            return a;
        }

        // Override default methods in Collection
        @Override
        public void forEach(Consumer<? super E> action) {
            Objects.requireNonNull(action);
        }
        @Override
        public boolean removeIf(Predicate<? super E> filter) {
            Objects.requireNonNull(filter);
            return false;
        }
        @Override
        public Spliterator<E> spliterator() { return Spliterators.emptySpliterator(); }

        // Preserves singleton property
        private Object readResolve() {
            return EMPTY_SET;
        }

        @Override
        public int hashCode() {
            return 0;
        }
    }

    public static <T> Comparator<T> reverseOrder() {
        return (Comparator<T>) MyCollection.ReverseComparator.REVERSE_ORDER;
    }

    /**
     * @serial include
     */
    private static class ReverseComparator
            implements Comparator<Comparable<Object>>, Serializable {

        private static final long serialVersionUID = 7207038068494060240L;

        static final MyCollection.ReverseComparator REVERSE_ORDER
                = new MyCollection.ReverseComparator();

        public int compare(Comparable<Object> c1, Comparable<Object> c2) {
            return c2.compareTo(c1);
        }

        private Object readResolve() { return Collections.reverseOrder(); }

        @Override
        public Comparator<Comparable<Object>> reversed() {
            return Comparator.naturalOrder();
        }
    }
}

