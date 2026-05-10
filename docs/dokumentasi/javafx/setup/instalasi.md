---
layout: post
---

Post ini menggunakan [Java SDK 26](https://jdk.java.net/26/). Jika ingin menggunakan versi yang lebih baru atau sudah terlanjur install yang lebih lama, gunakan link yang terdapat di situ untuk download OpenJDK yang sesuai dengan pilihan Anda.

Setelah download, _uncompress_ package tersebut, lalu tempatkan di folder yang mudah dicari.
Setelah itu Anda harus memasukkan `jdk_path` tersebut ke dalam variabel `PATH` untuk OS Anda. 

Perhatikan baik-baik, yang dimaksud dengan `jdk_path` di atas adalah nama sub-folder "bin" yang ada di dalamnya, bukan folder itu sendiri. Dengan begitu nantinya semua program yang ada di situ akan bisa dieksekusi dengan mudah dari dalam `Terminal` Anda. Tidak masalah OS apa pun yang Anda gunakan untuk membuat program.

Misalnya, dalam contoh ini saya menggunakan OS `Windows 10`, dan menempatkan folder tersebut di `HOME Directory` saya, dengan nama "jdk-26" (sebaiknya tidak menggunakan nama folder yang mengandung spasi atau karakter aneh di luar ANSI), maka yang kita masukkan ke dalam variabel PATH adalah: `%USERPROFILE%\jdk-26\bin`.

Saya juga menganjurkan untuk membuat sebuah `System Variable` atau `User Variable` bernama `JAVA_HOME`, dan memasukkan direktori folder "jdk-26" itu ke dalamnya.

Jika memakai `Windows`, mungkin lebih baik buat sebuah file kecil bernama "Terminal.bat" yang bisa kita klik kapan saja kita ingin membuat program java, seperti berikut:

```bat
@echo off
PATH=%PATH%;%USERPROFILE%\jdk-26\bin
cmd
```


Jika diperlukan, lakukan test sederhana dengan membuat program pendek berikut dengan nama "Hello.java":

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Sekalian print semua argumen yang dikirimkan
        for (String s : args) {
            System.out.println(" => " + s);
        }
    }
}
```

Simpan file itu sebagai "Hello.java", lalu ketik perintah berikut di terminal kita tadi:

```bash
javac Hello.java
java Hello this is a test
```

Hasilnya adalah:

```text
Hello, World!
 => this
 => is
 => a
 => test
```

Instalasi ini sudah bisa dipakai untuk belajar `Java Programming` di tingkat dasar.


## Instalasi JavaFX

Gunakan [link ini](https://openjfx.io/openjfx-docs/#install-javafx) untuk download `JavaFX SDK` yang sesuai.

Seperti contoh sebelumnya, _uncompress_ dan tempatkan hasil download itu di folder pilihan Anda. Lalu Anda juga sebaiknya membuat sebuah file "Terminal.bat" kecil berisi variabel `JFX_PATH` itu, supaya dengan mudah bisa dipakai dalam kompilasi.

Sistem `modular` dalam Java versi modern agak menyulitkan kita melakukan kompilasi, tapi ini bukan tidak bisa dipermudah.


