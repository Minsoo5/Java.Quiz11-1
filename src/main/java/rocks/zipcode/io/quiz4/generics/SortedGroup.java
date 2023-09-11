package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {
    private Group<_> group = new Group<>();

    @Override
    public void insert(Object value) {
        group.insert(value);
    }

    @Override
    public void delete(Object value) {
        group.delete(value);
    }

    public Integer indexOf(_ value) {
        Iterator<_> sorted = group.iterator();
        ArrayList<_> sortedList = new ArrayList<>();
        sorted.forEachRemaining(sortedList::add);
        return sortedList.indexOf(value);
    }
}
