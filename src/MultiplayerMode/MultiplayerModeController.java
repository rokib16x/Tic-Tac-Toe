package MultiplayerMode;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class MultiplayerModeController {

    @FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    private Button b3;

    @FXML
    private Button b4;

    @FXML
    private Button b5;

    @FXML
    private Button b6;

    @FXML
    private Button b7;

    @FXML
    private Button b8;

    @FXML
    private Button b9;

    @FXML
    private Text whosTurn;

    @FXML
    private Text tf;

    @FXML
    void button1(ActionEvent event) {

    }

    @FXML
    void button2(ActionEvent event) {

    }

    @FXML
    void button3(ActionEvent event) {

    }

    @FXML
    void button4(ActionEvent event) {

    }

    @FXML
    void button5(ActionEvent event) {

    }

    @FXML
    void button6(ActionEvent event) {

    }

    @FXML
    void button7(ActionEvent event) {

    }

    @FXML
    void button8(ActionEvent event) {

    }

    @FXML
    void button9(ActionEvent event) {

    }

    @FXML
    void changeScreen(ActionEvent event) throws IOException {
        Parent goToHome = FXMLLoader.load(getClass().getResource("/TicTacToeApp/TicTacToeMain.fxml"));
        Scene scene = new Scene(goToHome);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void resetGame(ActionEvent event) {

    }

}
