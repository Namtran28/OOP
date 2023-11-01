public class Point {
    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double distance(Point a) {
        double d = Math.abs(a.pointX - a.pointY);
        return d;
    }

    /**
     * Ham so sanh.
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Point other = (Point) obj;
        if (Double.doubleToLongBits(pointX) != Double.doubleToLongBits(other.pointX)) {
            return false;
        }
        if (Double.doubleToLongBits(pointY) != Double.doubleToLongBits(other.pointY)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return String.format("(%.1f,%.1f)", pointX, pointY);
    }
}