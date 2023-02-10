package fluffy.cat;
@FunctionalInterface
public interface ArrayAndElements<T,S> {
    int findCountEntryElement(T[] array, S element);
}
