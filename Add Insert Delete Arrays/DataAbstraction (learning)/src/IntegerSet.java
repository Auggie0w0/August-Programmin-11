import org.junit.Before;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class IntegerSet {
    private Set<Integer> set;

    public void insert(int number) {
        set.add(number);
    }

    public void remove(int number) {
        set.remove(number);
    }

    public int size() {
        return set.size();
    }

    public boolean contains(int number) {
        return set.contains(number);
    }
}