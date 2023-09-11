package rocks.zipcode.io.quiz4.generics;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_ extends Comparable> extends Group<_> {

    @Override
    public void insert(Object value) {
        super.insert(value);
        Collections.sort(list);
    }

    @Override
    public void delete(Object value) {
        list.remove(value);
        Collections.sort(list);
    }

    public Integer indexOf(_ value) {
//        Iterator<_> sorted = list.iterator();
//        List<_> sortedList = new ArrayList<>();
//        sorted.forEachRemaining(sortedList::add);
//        Collections.sort(sortedList);
//        return sortedList.indexOf(value);
        return list.indexOf(value);
    }

}
