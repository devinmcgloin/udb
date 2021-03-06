package funct;

/**
 * Created by devinmcgloin on 1/25/16.
 * simple predicate functions, takes an item of type e and returns a boolean
 */
public interface Predicate<E> extends Functor<E, Boolean> {
    Boolean apply(E item);

}
