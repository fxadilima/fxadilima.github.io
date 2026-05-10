---
layout: page
title: JavaFX
---

Penekanan kita adalah penggunaan `WebView` yang disediakan oleh `JavaFX`, karena sangat mirip dengan `WebView` milik Android.

Mula-mula kita tentu harus menginstall `JDK`, dalam contoh ini menggunakan `JDK 26` yang saya letakkan di dalam folder `%USERPROFILE%\jdk-26`. Supaya mudah mengaksesnya untuk berbagai keperluan, sebaiknya kita gunakan sebuah `Batch File` yang bernama "Terminal.bat" di salah satu folder kosong, misalnya gunakan nama yang sederhana seperti "java".

```bat
@echo off
PATH=%PATH%;%USERPROFILE%\jdk-26\bin
cmd
```

Test untuk terminal yang baru kita buat.

```bash
java -version

# Atau langsung menggunakan compiler yang kita perlukan:

javac -version
```

Jika perlu, buat sebuah file "Hello, World!" untuk ini:

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

Perhatikan bahwa ukuran file "Hello.class" yang dihasilkan itu _hanya_ 976 Byte.

## Install JavaFX SDK


Lalu tulis (atau copy) kode berikut:

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFX extends Application {

    @Override
    public void start(Stage stage) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Scene scene = new Scene(new StackPane(l), 320, 240);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
```

Nah, sekarang tiba saatnya kompilasi program tersebut.

Tambahkan teks berikut ke Terminal.bat kita sebelum menggunakannya:

```bash
SET JFX_PATH=%~dp0\jfx-26\lib
cmd.exe
```

Untuk program di atas, kita hanya perlu menggunakan satu module, yaitu "javafx.controls", tetapi kita tetap harus menyertakan dua switch, seperti contoh berikut:

```bash
javac --module-path %JFX_PATH% --add-modules javafx.controls HelloFX.java
```

Begitu juga untuk eksekusi program, kita harus memanggil java dengan menggunakan kedua switch itu.

```bash
java --module-path %JFX_PATH% --add-modules javafx.controls HelloFX
```

---

## Membuat Aplikasi JavaFX

Contoh sederhana berikut adalah sebuah "Mini Browser" yang berfungsi hanya untuk mengakses situs pribadi saya, berisi cerita silat bersambung:

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Cersil extends Application {
    @Override
    public void start(Stage stage) {
        WebView webView = new WebView();
        // Use the engine to load a website
        webView.getEngine().load("https://cersil.netlify.app");

        Scene scene = new Scene(webView, 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

Kali ini, untuk kompilasi, kita menggunakan cara berikut:

```bash
javac --module-path %JFX_PATH% --add-modules javafx.controls,javafx.web,javafx.fxml Cersil.java
```

