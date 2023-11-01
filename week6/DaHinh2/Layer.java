import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    /**
     * Ham them vao List.
     * @param a - Hinh a.
     */
    public void addShape(Shape a) {
        shapes.add(a);
    }

    /**
     * Tim cac hinh tron.
     * @param a - Hinh a.
     * @return - true or false.
     */
    public boolean findCircle(Shape a) {
        if (a instanceof Circle) {
            return true;
        }
        return false;
    }

    /**
     * Ham xoa hinh tron.
     */
    public void removeCircles() {
        int n = shapes.size();
        for (int i = 0; i < n; i++) {
            if (findCircle(shapes.get(i))) {
                shapes.remove(i);
                i--;
                n--;
            }
        }
    }

    /**
     * Ham in ra man hinh.
     * @return - Xau s.
     */
    public String getInfo() {
        String s = "";
        s += "Layer of crazy shapes:\n";
        final int n = shapes.size();
        for (int i = 0; i < n; i++) {
            s += shapes.get(i).toString();
            s += "\n";
        }
        return s;
    }

    /**
     * Kiem tra cac hinh giong nhau.
     * @param a - Hinh a.
     * @param b - Hinh b.
     * @return - true or false.
     */
    public boolean sameShape(Shape a, Shape b) {
        if (a.equals(b)) {
            return true;
        }
        return false;
    }

    /**
     * Xoa phan tu giong nhau.
     */
    public void removeDuplicates() {
        int n = shapes.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sameShape(shapes.get(i), shapes.get(j))) {
                    shapes.remove(j);
                    j--;
                    n--;
                }
            }
        }
    }
}