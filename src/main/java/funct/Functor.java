package funct;

/**
 * Created by devinmcgloin on 1/25/16.
 * function that take a value e and returns a value t.
 */
public interface Functor<E, T> {
    T apply(E item);
}
