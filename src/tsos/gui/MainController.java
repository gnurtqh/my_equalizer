package tsos.gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Slider;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import tsos.player.Player;

public class MainController implements Initializable {
  @FXML
  private Slider slider;
  @FXML
  private Text label;
  @FXML
  private CheckBox checkBox;
  @FXML
  private NumberAxis xAxisBefore, yAxisBefore, xAxisAfter, yAxisAfter;
  @FXML
  private LineChart beforeChart, afterChart;

  private XYChart.Data[] dataAfter;
  private XYChart.Data[] dataBefore;

  private Player player;
  private File file;
  private Thread playAudio, visualizeAudio;

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    this.initialGraph();
  }

  @FXML
  private void open() throws FileNotFoundException, IOException, UnsupportedAudioFileException,
      LineUnavailableException, InterruptedException {
    if (this.playAudio != null) {
      this.stop();
    }
    FileChooser fileChooser = new FileChooser();
    fileChooser.setTitle("Choose Audio File");
    fileChooser.getExtensionFilters().addAll(new ExtensionFilter("Audio Files", "*.wav"));
    File selectedFile = fileChooser.showOpenDialog(new Stage());
    if (selectedFile == null)
      return;
    else
      this.file = selectedFile;
  }

  @FXML
  private void play() {
    if (this.file == null) {
      System.out.println(this.playAudio);
      return;
    }
    this.playAudio = new Thread(() -> {
      this.player = new Player(this.file);
      try {
        this.player.play();
      } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
        e.printStackTrace();
      }
    });
    this.visualizeAudio = new Thread(() -> {
      while (true) {
        if (this.player != null && this.player.getDatasource() != null && this.player.getDataFilter() != null) {
          System.out.println("ok");
          for (int i = 0; i < this.player.getDatasource().length; i++) {
            this.dataBefore[i].setYValue(this.player.getDatasource()[i]);
            this.dataAfter[i].setYValue(this.player.getDataFilter()[i]);
          }
        } else
          System.out.println("false");
      }
    });
    this.playAudio.start();
    this.visualizeAudio.start();
  }

  @FXML
  private void stop() throws IOException {
    if (this.visualizeAudio == null || this.playAudio == null || this.playAudio.interrupted() == true
        || this.visualizeAudio.interrupted() == true)
      return;
    this.playAudio.interrupt();
    this.visualizeAudio.interrupt();
    this.player.stop();
  }

  @FXML
  private void toggleFilter() {
    this.player.setFilter(this.checkBox.isSelected());
  }

  private void initialGraph() {
    XYChart.Series beforeGraph = new XYChart.Series<>();
    XYChart.Series afterGraph = new XYChart.Series<>();
    int size = 512;
    dataBefore = new XYChart.Data[size];
    dataAfter = new XYChart.Data[size];
    for (int i = 0; i < dataBefore.length; i++) {
      dataBefore[i] = new XYChart.Data<>(i, 0);
      beforeGraph.getData().add(dataBefore[i]);
      dataAfter[i] = new XYChart.Data<>(i, 0);
      afterGraph.getData().add(dataAfter[i]);
    }

    beforeChart.getData().add(beforeGraph);
    afterChart.getData().add(afterGraph);
    beforeChart.setCreateSymbols(false);
    afterChart.setCreateSymbols(false);
    beforeChart.setAnimated(false);
    afterChart.setAnimated(false);

    this.beforeChart.getYAxis();
    this.yAxisBefore.setLowerBound(-0.2);
    this.yAxisBefore.setUpperBound(0.3);
    this.yAxisBefore.setAnimated(false);

    this.afterChart.getYAxis();
    this.yAxisAfter.setLowerBound(-0.2);
    this.yAxisAfter.setUpperBound(0.3);
    this.yAxisAfter.setAnimated(false);
  }
}
