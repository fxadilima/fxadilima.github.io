
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
        stage.setTitle("Cersil WebView");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
