package TicTacToeApp;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class TicTacToeMainController {

    @FXML
    private Button buttonDuo;

    @FXML
    private Button buttonDuoSeries;

    @FXML
    private Button buttonDuoMultiplayer;

    @FXML
    private Button buttonExit;

    @FXML
    private Button buttonAbout;

    //For MainMenu or HomeMenu to About Scene
    @FXML
    void onAboutTheGame(ActionEvent event) throws IOException {
        Parent goToAbout = FXMLLoader.load(getClass().getResource("/About/About.fxml"));
        Scene scene = new Scene(goToAbout);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void onDuoMode(ActionEvent event) throws IOException {
        Parent goToDuoMode = FXMLLoader.load(getClass().getResource("/DuoMode/DuoMode.fxml"));
        Scene scene = new Scene(goToDuoMode);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void onDuoSeriesMode(ActionEvent event) throws IOException {
        Parent goToDuoMode = FXMLLoader.load(getClass().getResource("/DuoSeriesMode/DuoSeries.fxml"));
        Scene scene = new Scene(goToDuoMode);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void onDuoMultiplayerMode(ActionEvent event) throws IOException {
        Parent goToDuoMode = FXMLLoader.load(getClass().getResource("/MultiplayerMode/MultiplayerMode.fxml"));
        Scene scene = new Scene(goToDuoMode);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void onExit(ActionEvent event) {
        Platform.exit();
    }


}
