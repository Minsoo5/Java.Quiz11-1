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
    public SortedGroup(_... elements){
        for (_ e : elements) {
            list.add(e);
        }
    }

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
        return list.indexOf(value);
    }

}
