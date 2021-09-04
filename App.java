import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
public class App extends Application{
    public static void main(String[] args){
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent vista = FXMLLoader.load(getClass().getResource("reto3.fxml"));
        Scene scene = new Scene(vista);
        stage.setTitle("Reto 3");
        stage.setScene(scene);
        stage.show();

    }
}
