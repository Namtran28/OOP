public class StudentManagement {
    private static Student[] students = new Student[100];
    private static int n = 0;

    /**
     * Ham kiem tra xem si va s2 co chung group hay khong.
     * @param s1 - Sinh vien 1.
     * @param s2 - Sinh vien 2.
     * @return - Tra ve True neu cung group, False neu khac group.
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * Them sinh vien vao mang students.
     * @param newStudent - Tra ve mang students khi da them newStudent.
     */
    public static void addStudent(Student newStudent) {
        for (int i = 0; i < n; i++) {
            if (students[i].getId().equals(newStudent.getId())) {
                return;
            }
        }

        students[n++] = newStudent;
    }

    /**
     * Ham dua ra mot chuoi chua cac sinh vien da chia theo group.
     * @return - Tra ve danh sach sinh vien da chia theo group.
     */
    public static String studentsByGroup() {
        String question = "";
        StringBuilder infomation = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (!question.contains(students[i].getGroup())) {
                question += " " + students[i].getGroup();
            }
        }

        for (String group: question.split(" ")) {
            infomation.append(group).append("\n");
            for (int i = 0; i < n; i++) {
                if (students[i].getGroup().equals(group)) {
                    infomation.append(students[i].getInfo()).append("\n");
                }
            }
        }

        return infomation.toString();
    }

    /**
     * Ham removeStudent giup xoa sinh vien cos msv id ra khoi mang students.
     * @param id - Tra ve mang students sau khi da xoa sinh vien cos msv id.
     */
    public static void removeStudent(String id) {
        int delete = -1;
        for (int i = 0; i < n; i++) {
            if (students[i].getId().equals(id)) {
                delete = i;
                break;
            }
        }

        if (delete == -1) {
           return;
        }

        for (int i = delete; i < n; i++) {
            students[i] = students[i + 1];
        }

        n--;
    }

    /**
     * Hàm main.
     * @param args - arguments
     */
    public static void main(String[] args) {
        // addStudent(new Student("Nguyen Van An", "17020001", "17020001@vnu.edu.vn"));
        // addStudent(new Student("Nguyen Van B", "17020002 ", "17020002@vnu.edu.vn"));
        // addStudent(new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn"));
        // addStudent(new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn"));
        // addStudent(new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn"));
        // students[0].setGroup("K62CC");
        // students[1].setGroup("K62CC");

        // System.out.println(n);

        // System.out.println(studentsByGroup());

        // removeStudent("17020004");

        // System.out.println();

        // System.out.println(n);

        // System.out.println(studentsByGroup());
    }
} 