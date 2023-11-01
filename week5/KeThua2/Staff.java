public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * Khoi tao cos tham so.
     * @param name - name.
     * @param address - address.
     * @param school - school.
     * @param pay - pay.
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * Ham tra ve chuoi.
     */
    public String toString() {
        String s = "";
        s = s + "Staff[" + super.toString() + ",school=" + school;
        s = s + ",pay=" + pay + "]";
        return s;
    }
}