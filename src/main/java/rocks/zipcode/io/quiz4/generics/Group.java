package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_ extends Object> implements GroupInterface{

    protected ArrayList<_> list = new ArrayList<>();
    public Group() {}
    public Group(_... elements) {
        for(_ e : elements) {
            list.add(e);
        }
    }

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
        Iterator<_> ans = list.iterator();
        return ans;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        list.stream().forEach(e -> sb.append(e.toString()).append(", "));
        sb.replace(sb.length()-2, sb.length()-1, "]");
        sb.replace(sb.length()-1, sb.length(), "");
        return sb.toString();
    }
}
