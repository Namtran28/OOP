public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * Khoi tao khong tham so.
     */
    public Shape() {

    }

    /**
     * Khoi tao co tham so.
     * 
     * @param color  - color.
     * @param filled - filled.
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Getter of color.
     * 
     * @return - color.
     */
    public String getColor() {
        return color;
    }

    /**
     * Settor of color.
     * 
     * @param color - color.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * isFilled.
     * 
     * @return - filled.
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Setter of filled.
     * 
     * @param filled - filled.
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * getArea.
     * 
     * @return - Dien tich.
     */
    public abstract double getArea();

    /**
     * getPerimeter.
     * 
     * @return - Chu vi.
     */
    public abstract double getPerimeter();

    /**
     * toString.
     */
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
} 