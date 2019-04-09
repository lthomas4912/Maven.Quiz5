package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * @author leon on 18/12/2018.
 */
public class Group<T> implements GroupInterface,Iterable {
    private List<T> list = new ArrayList<>();
    public Group() {

    }

    public Iterator<T> iterator() {
      return list.iterator();
    }

    @Override
    public String toString() {
        return list.toString();
    }

    @Override
    public Integer count() {
        return list.size();
    }

    @Override
    public Boolean has(Object valueToInsert) {
        return list.contains(valueToInsert);
    }

    @Override
    public Object fetch(int indexOfValue) {
        return list.get(indexOfValue);
    }

    @Override
    public void insert(Object string) {
        list.add((T) string);
    }

    @Override
    public void delete(Object valueToInsert) {
        list.remove(valueToInsert);

    }

    @Override
    public void clear() {
        list.clear();
    }
}
