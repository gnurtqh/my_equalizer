package tsos.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

  @Override
  public void start(Stage stage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
    stage.setTitle("Equalizer");
    Scene scene = new Scene(root);
    stage.setScene(scene);
    scene.getStylesheets().add(Main.class.getResource("Style.css").toExternalForm());
    stage.setScene(scene);
    stage.setResizable(false);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

}
