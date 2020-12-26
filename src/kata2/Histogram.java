package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram<T> {
    private final T [] data;

    public Histogram(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }

    public Map<T, Integer> getHistogram() {
        Map<T, Integer> histogram = new HashMap<>();
        
        for (T info : data) {
            histogram.put(info, histogram.containsKey(info) ? histogram.get(info) + 1 : 1);
        }
        return histogram;
    }
}
