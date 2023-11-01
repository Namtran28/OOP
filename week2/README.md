# Đề bài :
<i>Từ tuần 2, khuyến khích sử dụng IDE (ví dụ Intellij) để code thay vì code, biên dịch và thực thi trên command line. Các hướng dẫn trong đây đều mặc định với IDE Intellij.</i>

Để thể hiện cho đối tượng con người, mã nguồn lớp Person dưới đây được cài đặt minh hoạ. Nó đơn giản bao gồm một thuộc tính name – là tên người; 2 phương thức khởi tạo, 1 không có tham số, và 1 có tham số là tên người; getter/setter cho thuộc tính name. Chi tiết thể hiện trong comment mã nguồn.
```sh
public class Person {
   String name; // thuộc tính name
   
   // phương thức khởi tạo không tham số
   public Person() {
   }

   // phương thức khởi tạo 1 tham số (name)
   public Person(String name) {
this.name = name;
   }

   // getter cho thuộc tính name
   public String getName() {
return name;
   }

   // setter cho thuộc tính name
   public void setName(String name) {
      this.name = name
   }
}
```
Sau khi đã đọc hiểu ví dụ bên trên, hãy tự cài đặt lớp Student theo yêu cầu cụ thể dưới đây.

1. Tạo lớp <strong>Student</strong> với các thuộc tính kiểu String, mức truy nhập private gồm: <strong>name</strong> (tên sinh viên), <strong>id</strong> (mã số sinh viên), <strong>group</strong> (lớp học), <strong>email</strong> (địa chỉ email).

2. Thêm các phương thức get/set cho các thuộc tính (gọi là getter/setter). Ví dụ, với thuộc tính “name”, hai phương thức cần thêm gồm “<strong>public String getName()</strong>” và “<strong>public void setName(String n)</strong>”.

3. Tạo đối tượng Student có tên là Nguyen Van An, id là 17020001, lớp K62CC, email 17020001@vnu.edu.vn.
Thêm phương thức “<strong>String getInfo()</strong>” cho lớp Student. Phương thức này trả về tên, mã số SV, lớp, và email của sinh viên theo đúng định dạng sau:

<i>Nguyen Van An – 17020001 – K62CC – 17020001@vnu.edu.vn</i>
4. Thêm 3 phương thức khởi tạo cho lớp Student

- Phương thức khởi tạo không có tham số: <strong>Student()</strong>. Nếu khởi tạo bằng phương thức này, sinh viên được tạo ra sẽ có giá trị cho các thuộc tính như sau: name = “Student”, id=“000”, group=“K62CB”, email = “<i>uet@vnu.edu.vn</i>”

- Phương thức khởi tạo có tham số <strong>Student(String name, String id, String email)</strong>. Khởi tạo bằng phương thức này sẽ có sinh viên với các thuộc tính “name”, “id”, và “email” là các giá trị từ tham số, còn “group” có giá trị là “K62CB”.

- Phương thức khởi tạo sao chép <strong>Student(Student s)</strong>. Với phương thức này, đối tượng tạo ra sẽ có các thuộc tính với trị giống như của đối tượng s.

5. Tạo thêm lớp <strong>StudentManagement</strong> (tự tạo phương thức <strong>main()</strong> để kiểm tra các chức năng cài đặt bên trên). Trong lớp StudentMangement, viết một phương thức “<strong>public static boolean sameGroup(Student s1, Student s2)</strong>” để kiểm tra xem hai sinh viên s1 và s2 có cùng lớp hay không.

6. Sửa lại lớp StudentManagement để lớp này có một thuộc tính students là array (không dùng List) chứa các đối tượng thuộc lớp Student (max. 100) có tên <strong>students</strong>. Viết phương thức <strong>public void addStudent(Student newStudent)</strong> để thêm mới một Student vào mảng.

7. Viết phương thức “<strong>public String studentsByGroup()</strong>” cho lớp StudentManagement trả về chuỗi in danh sách sinh viên theo lớp tuân theo định dạng sau (lưu ý lớp sắp xếp theo thứ tự xuất hiện đầu tiên, sinh viên sắp xếp theo thứ tự thêm vào):
```sh
K62CC
Nguyen Van An - 17020001 – K62CC – 17020001@vnu.edu.vn
Nguyen Van B - 17020002 – K62CC – 17020002@vnu.edu.vn
K62CB
Nguyen Van C - 17020003 – K62CB – 17020003@vnu.edu.vn
Nguyen Van D - 17020004 – K62CB – 17020004@vnu.edu.vn
```
<i>Thứ tự thêm sinh viên ở trên là An, B, C, D (thêm sinh viên bằng phương thức addStudent).</i>

<strong>Chú ý:</strong> sử dụng ký tự \n để xuống dòng khi in chuỗi.

8. Viết phương thức “<strong>public void removeStudent(String id)</strong>” cho lớp StudentManagement để xóa sinh viên với mã số là id ra khỏi danh sách.
<strong>Hướng dẫn:</strong> Sau khi đã tải và cài đặt Intellij, nếu chạy lần đầu, cần config đường dẫn tới JDK đã cài đặt ở tuần 1:

9. <i>Click Configure -> Project Defaults -> Project Structure</i>

<img src='https://raw.githubusercontent.com/uetoop/OOPSummer2018/master/static/anh1.png'>

10. Cửa sổ mới hiện lên, bên trái chọn <i>SDKs</i>; bên phải click để chọn đường dẫn tới <i>JDK home path</i>. Sau khi chọn thành công click <i>OK</i> để ghi nhận.

<img src='https://raw.githubusercontent.com/uetoop/OOPSummer2018/master/static/anh2.png'>

Như vậy là đã config xong, lưu ý việc này chỉ tiến hành 1 lần, các lần sau không cần làm lại.

Tiếp theo, để tạo mới project, click vào <i>Create New Project</i> ở cửa sổ đầu tiên, tiếp đó 2 lần để nguyên mặc định và click <i>Next, Next</i> (2 lần). Ở cửa sổ cuối cùng, yêu cầu điền tên project và nơi lưu mã nguồn tương ứng. Sau khi hoàn thành, click <i>Finish</i> để xác nhận tạo mới project.

<img src='https://raw.githubusercontent.com/uetoop/OOPSummer2018/master/static/anh3.png'>

Tạo mới lớp Student bằng cách: right click <i>src -> New -> Java Class</i>; sau đó đặt tên cho class là Student và click <i>OK</i>. Tự hoàn thiện các yêu cầu còn lại.

<img src='https://raw.githubusercontent.com/uetoop/OOPSummer2018/master/static/anh4.png'>

Để chạy chương trình, right click class chứa phương thức <i>main</i> cần chạy, chọn <i>Run</i> (hoặc <i>Debug</i>)

<img src='https://raw.githubusercontent.com/uetoop/OOPSummer2018/master/static/anh5.png'>


### Định dạng đầu vào :

1. Các file .java nộp lên <strong>không định danh package</strong> trong đó (bỏ tất cả dòng pakage)
2. Tất cả <strong>file .java</strong> đặt <strong>cùng trong một folder</strong> và được nén lại dưới đuôi .zip
3. <strong>Tên folder</strong> chứa các <strong>file .java</strong> không được chứa ký tự đặc biệt hoặc ký tự khoảng trắng.
### Source code mẫu :
https://github.com/uetoop/OOPSummer2018/tree/master/StudentManagement
