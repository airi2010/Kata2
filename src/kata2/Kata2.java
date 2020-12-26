package kata2;

import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        Integer[] data = {3, 2, 12, 14, 4, 6, 3, 3, 2, 8, 5, 2, 9, 14, 9};
        String[] data2 = {"Juan", "Pedro", "Luis", "Alberto", "Airam", "Airam", "Alguien", "Pepe"};
        Histogram meta_histogram = new Histogram(data2);
        Map<Integer, Integer> histogram = meta_histogram.getHistogram();
        Iterator<Map.Entry<Integer,Integer>> entries = histogram.entrySet().iterator();
        while(entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("Hay " + entry.getValue()+ " repeticiones del valor "+ entry.getKey() );
        }
    }
    
}
