package About;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class AboutController {

    @FXML
    private Button buttonBackToMenu;

    //For About Scene to Main Menu or Home Menu
    @FXML
    void onBackToMenu(ActionEvent event) throws IOException {
        Parent goToHome = FXMLLoader.load(getClass().getResource("/TicTacToeApp/TicTacToeMain.fxml"));
        Scene scene = new Scene(goToHome);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

}
