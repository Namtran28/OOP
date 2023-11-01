public class Square extends Rectangle {

    /**
     * Khoi tao khong tham so.
     */
    public Square() {

    }

    /**
     * Khoi tao co tham so.
     * 
     * @param side - side.
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Khoi tao co tham so.
     * 
     * @param side   - side.
     * @param color  - color.
     * @param filled - filled.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    /**
     * Getter of side.
     * 
     * @return - side.
     */
    public double getSide() {
        return super.getLength();
    }

    /**
     * setSide.
     * 
     * @param side - side.
     */
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /**
     * toString.
     */
    public String toString() {
        return "Square[side=" + super.getLength() + ",color="
                + color + ",filled=" + filled + "]";
    }
}