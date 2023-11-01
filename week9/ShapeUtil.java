import java.util.List;

public class ShapeUtil {

    /**
     * hi.
     * @param shapes hi.
     * @return hi.
     */
    public String printInfo(List<GeometricObject> shapes) {
        int n = shapes.size();
        String s = "";
        s += "Circle:\n";
        for (int i = 0; i < n; i++) {
            if (shapes.get(i) instanceof Circle) {
                s += shapes.get(i).getInfo();
                s += "\n";
            }
        }
        s += "Triangle:\n";
        for (int i = 0; i < n; i++) {
            if (shapes.get(i) instanceof Triangle) {
                s += shapes.get(i).getInfo();
                s += "\n";
            }
        }
        return s;
    }
}