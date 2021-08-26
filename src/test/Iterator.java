package test;

public interface Iterator<V> {

    V next();

    boolean hasNext();

    void remove();
}
