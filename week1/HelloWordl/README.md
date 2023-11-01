# Đề bài :
### Triển khai trên máy tính cá nhân:

1. Tải và cài đặt Oracle JDK8 tại đây. Lưu ý, ở đây sử dụng Oracle JDK (ngoài ra có thể tìm hiểu thêm OpenJDK), Java SE, phiên bản 1.8 (đã có nhiều JDK version mới hơn, tuy nhiên để thống nhất sẽ chọn JDK8).

2. Làm quen dòng lệnh trên Windows (trên Linux tương tự, chỉ 1 vài khác biệt nhỏ), các lệnh cơ bản (cd, dir/ls, copy/cp, etc):

- Mở cmd bằng cách tìm kiếm “cmd”, hoặc dùng <strong>Windows + R</strong> -> gõ “cmd” -> Enter

- Lệnh cd (change directory): câu lệnh này dùng để thay đổi vị trí thư mục hiện tại – di chuyển đến vị trí thư mục khác. Một số cách khác nhau khi sử dụng lệnh cd là:

    - <strong>cd .</strong> : đứng nguyên ở thư mục hiện tại

    - <strong>cd ..</strong> : di chuyển đến thư mục cha của thư mục hiện tại

    - <strong>cd /</strong> : di chuyển đến thư mục gốc của ố đĩa hiện tại (ví dụ: C:\ hoặc D:\,…)

    - <strong>cd <tên thư mục con></strong> : di chuyển đến thư mục con bên trong thư mục hiện tại

    - <strong>cd <đường dẫn đến thư mục></strong> : di chuyển đến thư mục với đường dẫn là đường dẫn cho trước.
- Lệnh dir (directory), (trên Linux tương ứng là ls): Hiển thị danh sách các tập tin và thư mục trong thư mục hiện tại.

3. Thêm Java vào biến môi trường Path, test thử lệnh <i>java, javac</i>

- Sử dụng Windows search (<i>Windows + S</i>) tìm kiếm “Edit the system environment variable”. Trong hộp thoại “System Properties” hiện lên, chọn “Environment Variables” như hình.

<img src='https://raw.githubusercontent.com/oasis-uet/uetoop/main/hello2.png'>

Trong hộp thoại Environment Variables, vào phần System variables và chọn New.

<img src='https://raw.githubusercontent.com/oasis-uet/uetoop/main/hello3.png'>

 Trong hộp thoại New System Variable, điền vào ô <strong>Variable name</strong> là <strong>JAVA_HOME</strong>, còn trong ô <strong>Variable value</strong> nhấn vào nút <strong>Browser Directory</strong> và trỏ tới đường dẫn cài đặt JDK. Nhấn OK để hoàn tất việc đặt tên biến môi trường.

<img src='https://raw.githubusercontent.com/oasis-uet/uetoop/main/hello4.png'>

Tiếp theo, cũng trong phần System variables, tiến hành sửa đổi biến môi trường <strong>Path</strong> như sau: Kích chuột vào dòng <strong>Path</strong> và chọn <strong>Edit</strong>. Hộp thoại <strong>Edit environment variable</strong> xuất hiện, chúng ta nhấn chuột vào nút <strong>New</strong> và điền vào dòng sau: <strong>%JAVA_HOME%\bin</strong>, nhấn OK để kết thúc.

- Kiểm tra bằng cách mở cmd, nhập vào dòng: <strong>java –version</strong>. Nếu thông tin hiển thị ra là version Java tương tự như hình dưới là thành công.

<img src='https://raw.githubusercontent.com/oasis-uet/uetoop/main/hello5.png'>

4. Sau khi đã hoàn tất việc cài đặt Java, hãy viết chương trình đơn giản in ra dòng “Hello World”, biên dịch và thực thi sử dụng command. Giả sử code được lưu trong file Week1.java, gợi ý các bước làm như sau:
- Sử dụng lệnh <i>cd</i> để đến thư mục chứa file <strong>Week1.java</strong>.

- Thực thi command <i>javac Week1.java</i> để biên dịch mã nguồn, nếu không có lỗi in ra là thành công.

- Thực thi command <i>java Week1</i>, nếu thành công sẽ in ra dòng chữ “Hello World”.

5. Thêm tham số dòng lệnh, in ra <strong>Hello student_name</strong>, trong đó student_name là tên được truyền vào bằng tham số dòng lệnh.

Sau khi triển khai trên máy tính cá nhân, bạn hãy viết một chương trình bao gồm lớp <i>Solution</i> có phương thức <i>printHello()</i> trả về kết quả <i>HelloWorld</i>, trong hàm <i>main</i> của lớp này gọi đến phương thức printHello() và in ra màn hình kết quả <i>HelloWorld</i>. Viết nội dung tệp Solution.java vào phần dưới đây:

<strong>Chú ý:</strong> Không được thay đổi tên lớp <strong>Solution</strong>