public class Point {
    private double pointX;
    private double pointY;

    /**
     * hi.
     * @param x hi.
     * @param y hi.
     */
    public Point(double x, double y) {
        pointX = x;
        pointY = y;
    }

    public double getPointX() {
        return pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * hi.
     * @param other hi.
     * @return hi.
     */
    public double distance(Point other) {
        double d;
        double a;
        double b;
        a = (Double) Math.pow(other.getPointX() - pointX, 2);
        b = (Double) Math.pow(other.getPointY() - pointY, 2);
        d = (Double) Math.sqrt(a + b);
        return (Double) d;
    }
}