public class Person<T> implements Comparable<Person> {
    protected String name;
    protected int age;
    protected String address;


    public Person() {

    }

    /**
     * hi.
     * @param name hi.
     * @param age hi.
     * @param address hi.
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    /**
     * hi.
     * @param name hi.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * hi.
     * @param age hi.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * hi.
     * @param address hi.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * hi.
     * @param p hi.
     * @return hi.
     */
    public int compareTo(Person p) {
        int n = this.name.compareTo(p.getName());
        if (n == 0) {
            return this.age - p.getAge();
        }
        return n;
    }
}