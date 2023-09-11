package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {
    ArrayList<_> sorted = new ArrayList<>();
    @Override
    public void insert(Object value) {
        _ valueToInsert = (_) value;
        sorted.add(valueToInsert);
    }

    @Override
    public void delete(Object value) {
        sorted.remove(value);
    }

    public Integer indexOf(_ value) {
        return null;
    }
}
