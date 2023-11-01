# Đề bài :
Hướng dẫn này nhằm hướng tới việc giúp bạn có thể tạo mới 1 repo trên 1 git server như Github/Gitlab, clone repo về local, pull/push code giữa local và server.

1. Đăng ký 1 tài khoản trên [Github](https://github.com) (có thể dùng [Gitlab](https://about.gitlab.com) cũng tương tự), nếu có rồi thì bỏ qua bước này.
2. Tải và cài đặt Github Desktop tại [đây](https://desktop.github.com)
3. Cài đặt hoàn tất, mở Github Desktop, click chọn <strong>Clone a repository from the Internet</strong>, click chọn <strong>Sign in</strong>, sau đó đăng nhập theo tài khoản Github của mình (đã đăng ký tại bước đầu tiên).

<img src='https://raw.githubusercontent.com/oasis-uet/uetoop/main/1.png'>

4. Sau đó chọn đúng repo mình muốn clone về local, chọn nơi sẽ lưu repo tại local, và click <strong>Clone</strong>.

<img src='https://raw.githubusercontent.com/oasis-uet/uetoop/main/2.png'>

 5. Trong trường hợp bạn đã clone repo từ trước đó (sử dụng cmd or others), chọn <strong>File -> Add local repository</strong>, chọn tới folder chứa repo tại local (folder chứa thư mục .git).

<img src='https://raw.githubusercontent.com/oasis-uet/uetoop/main/3.png'>

6. Với các lần sau:
- Đảm bảo đã chọn đúng repo, tại trên cùng bên trái <strong>Current repository</strong>
Chọn <strong>Fetch origin</strong> tại bên phải trên cùng, nếu có xuất hiện <strong>Pull origin</strong>, click để pull change từ server về.

<img src='https://raw.githubusercontent.com/oasis-uet/uetoop/main/4.png'>

- Sau khi đã thay đổi mã nguồn và mong muốn commit lên server, bạn hãy chọn các file thay đổi (bỏ tick những file không push lên, ví dụ như file .class). Thêm commit message, chọn 'commit to master' ở dưới.

<img src='https://raw.githubusercontent.com/oasis-uet/uetoop/main/5.png'>

- click chọn <strong>push origin</strong> để push lên server

<img src='https://raw.githubusercontent.com/oasis-uet/uetoop/main/6.png'>

- Cuối cùng lên http://github.com để kiểm tra commit của mình.