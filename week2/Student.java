public class Student {
    private String name;
    private String id;
    private String email;
    private String group;

    /**
     * Khởi tạo không tham số.
     */
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Khởi tạo co tham số.
     * @param name - Ten sinh vien.
     * @param email - Hom thu sinh vien.
     * @param id - Ma sinh vien.
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    /**
     * Khoi tao tham so de sao chep doi tuong s.
     * @param s - Tra ve thong tin doi tuong s.
     */
    public Student(Student s) {
        this.name = s.getName();
        this.id = s.getId();
        this.group = s.getGroup();
        this.email = s.getEmail();
    }

    /**
     * Getter of name.
     * @return - Tra ve ten sinh vien.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter of name.
     * @param name - name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter of id.
     * @return - Tra ve ma sinh vien.
     */
    public String getId() {
        return id;
    }

    /**
     * Setter of id.
     * @param id - id.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter of group.
     * @return - Tra ve nhoms coa sinh vien.
     */
    public String getGroup() {
        return group;
    }

    /**
     * Setter of group.
     * @param group - group.
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Getter of email.
     * @return - Tra ve hom thu sinh vien.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter of email.
     * @param email - email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Ham tra ve theo mau name - id - group - email.
     * @return - Tra ve Nguyen Van An - 17020001 - K62CC - 17020001@vnu.edu.vn
     */
    public String getInfo() {
        return this.name + " - " + this.id + " - " + this.group + " - " + this.email;
    }
}