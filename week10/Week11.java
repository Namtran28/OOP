import java.util.List;

public class Week11 {

    /**
     * hi.
     * @param <T> hi.
     * @param arr hi.
     * @return hi.
     */
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> arr) {
        int n = arr.size();
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            T temp = arr.get(i);
            while (j >= 0 && arr.get(j).compareTo(temp) > 0) {
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1, temp);
        }
        return arr;
    }
} 