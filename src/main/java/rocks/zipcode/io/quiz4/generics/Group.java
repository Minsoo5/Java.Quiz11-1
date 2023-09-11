package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_ extends Object> implements GroupInterface{

    private ArrayList<_> list = new ArrayList<>();
    public Group() {}

    public Integer count() {
        return list.size();
    }

    @Override
    public Boolean has(Object valueToInsert) {
        return list.contains(valueToInsert);
    }

    public _ fetch(int indexOfValue) {
        return list.get(indexOfValue);
    }

    @Override
    public void insert(Object string) {
        _ toAdd = (_) string;
        list.add(toAdd);
    }

    @Override
    public void delete(Object valueToInsert) {
        list.remove(valueToInsert);
    }

    public void clear() {
        list.clear();
    }

    public Iterator<_> iterator() {
        return null;
    }
}
