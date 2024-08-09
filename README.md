# Product Catalog

Bu proje, ürünleri yönetmek ve kataloglamak için basit bir API sağlar. Java 17 ve Spring Boot 3.3.2 kullanılarak geliştirilmiştir.

## Teknolojiler

- **Java**: 17
- **Spring Boot**: 3.3.2

## Bağımlılıklar

- **Jpa**: JPA (Java Persistence API) kullanılarak veritabanı işlemleri yapılır.
- **spring-boot-starter-web**: Web uygulamaları geliştirmek için gerekli bağımlılıklar.
- **devtools**: Geliştirme sırasında uygulama yeniden başlatma ve diğer geliştirme araçları.
- **h2**: H2 veritabanı, geçici bir veritabanı olarak kullanılır.
- **lombok**: Getter ve setter gibi boilerplate kodları azaltan bir kütüphane.
- **spring-boot-starter-test**: Test yazılımı için gerekli bağımlılıklar.
- **swagger**: API dokümantasyonu ve test arayüzü sağlar.

## Bağlantılar

- **Swagger UI**: API belgelerine erişmek için [Swagger UI](http://localhost:8080/swagger-ui/index.html) linkini kullanabilirsiniz.
- **H2 Console**: H2 veritabanı konsoluna erişmek için [H2 Console](http://localhost:8080/h2-console) linkini kullanabilirsiniz.

## Kurulum

1. **Proje Bağımlılıklarını Yükleyin**

   Maven kullanıyorsanız:

   ```bash
   mvn install
