# Demo Docker Spring Boot Project

Dự án này là một ví dụ đơn giản về ứng dụng Spring Boot chạy với Docker, sử dụng **Java 17**.

## 🛠 Yêu cầu hệ thống (Prerequisites)
- **Docker**: Đã cài đặt và đang chạy.
- **Java 17** & **Maven**: (Chỉ cần nếu bạn muốn chạy trực tiếp không qua Docker).

---

## 🐳 Cách 1: Chạy bằng Docker Compose (Khuyên dùng)
Đây là cách đơn giản nhất để quản lý container và đẩy image lên Docker Hub.

1. **Build & Chạy ứng dụng**:
   ```bash
   docker-compose up --build
   ```

2. **Đẩy Image lên Docker Hub**:
   Trước tiên, hãy đăng nhập vào Docker Hub:
   ```bash
   docker login
   ```
   Sau đó đẩy image:
   ```bash
   docker-compose push
   ```
   *Image sẽ được đẩy lên: `nguyendat1306/demodocker:latest`*

---

## 🚀 Cách 2: Chạy bằng Docker CLI (Truyền thống)
1. **Build Docker Image**:
   ```bash
   docker build -t nguyendat1306/demodocker:latest .
   ```

2. **Chạy Container**:
   ```bash
   docker run -p 8080:8080 nguyendat1306/demodocker:latest
   ```

---

## 💻 Cách 2: Chạy bằng Maven (Local)
*Lưu ý: Bạn phải cài đặt JDK 25 trên máy để sử dụng cách này.*

1. **Chạy dự án**:
   ```bash
   mvn spring-boot:run
   ```

2. **Hoặc đóng gói rồi chạy**:
   ```bash
   mvn package
   java -jar target/app.jar
   ```

---

## 🔍 Kiểm tra kết quả
Sau khi ứng dụng khởi động thành công, hãy mở trình duyệt và truy cập:
👉 **[http://localhost:8080/](http://localhost:8080/)**

Bạn sẽ thấy giao diện **Dark Mode & Glassmorphism** hiện đại hiển thị tên của mình.

---

## 📝 Thông tin bổ sung
- **Cổng mặc định**: 8080
- **Dockerfile**: Sử dụng Multi-stage build để tối ưu hóa kích thước image.
- **Java Version**: 17 (Eclipse Temurin)
