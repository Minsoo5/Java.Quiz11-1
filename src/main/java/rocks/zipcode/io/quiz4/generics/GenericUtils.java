package rocks.zipcode.io.quiz4.generics;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {
    public static <_ extends Comparable> Iterable<? extends Iterable<_>> powerSet(Set<_> originalSet) {
        // Returns an Iterable<_> from an originalSet where _ is comparable AND Iterable
        // 2 will result 4 sub sets
        // 3 will result 9 sub sets
        // [a, b, c]
        Set<Set<_>> resultSet = new LinkedHashSet<>();
        List<List<_>> list = new ArrayList<>();
        Object[] array = originalSet.toArray();

        for (int i = 0; i < originalSet.size(); i++) {
            List<_> temp = new ArrayList<>();
            for (int j = i; j < originalSet.size(); j++) {
                temp.add((_) array[j]);
            }
            resultSet.add(temp.stream().collect(Collectors.toSet()));
        }

//        for (int i = originalSet.size()-1; i > -1; i--) {
//            List<_> temp = new ArrayList<>();
//            for (int j = i; j > -1; j--) {
//                temp.add((_) array[j]);
//            }
//            resultSet.add(temp.stream().collect(Collectors.toSet()));
//        }

        return resultSet;
    }

    public static <_ extends Comparable> Iterable<? extends Iterable<_>> powerSet(_... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }
}

